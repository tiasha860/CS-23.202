/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java .util.HashMap;
/**
 *
 * @author tiash
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 🔹 Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("HashMap: " + map);

        // 🔹 Retrieve value using key
        System.out.println("Value for key 2: " + map.get(2));

        // 🔹 Remove entry
        map.remove(3);
        System.out.println("After removal: " + map);

        // 🔹 Iterate through map
        System.out.println("Iterating elements:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}