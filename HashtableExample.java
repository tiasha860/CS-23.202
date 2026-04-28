/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Hashtable;
/**
 *
 * @author tiash
 */
public class HashtableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(10, "A");
        ht.put(20, "B");

        System.out.println(ht.get(10));    
    }
    
}
