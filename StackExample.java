/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author tiash
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // 🔹 Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // 🔹 Peek (top element)
        System.out.println("Top element: " + stack.peek());

        // 🔹 Pop (remove top)
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // 🔹 Check if empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
 
    