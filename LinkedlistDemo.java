/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;

/**
 *
 * @author tiash
 */
public class LinkedlistDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        LinkedList<String> list = new LinkedList<>();

        
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        
        list.addFirst("Orange");

        
        list.add(2, "Grapes");

        System.out.println("After Insertions: " + list);

        
        list.remove("Banana");   
        list.remove(1);          

        System.out.println("After Deletions: " + list);

        // 🔹 Search element
        if (list.contains("Mango")) {
            System.out.println("Mango is found in the list");
        } else {
            System.out.println("Mango not found");
        }

        // 🔹 Display elements
        System.out.println("Displaying elements:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}