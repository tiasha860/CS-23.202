/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java .util.*;
/**
 *
 * @author tiash
 */
public class ArraylistDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 🔹 1. Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Initial List: " + list);

        // 🔹 2. Remove element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // 🔹 3. Search element
        if (list.contains("Mango")) {
            System.out.println("Mango is found in the list");
        } else {
            System.out.println("Mango not found");
        }

        // 🔹 4. Update element
        list.set(1, "Grapes"); // replaces Mango
        System.out.println("After updating index 1: " + list);

        // 🔹 5. Iterate through list
        System.out.println("Iterating using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}

