/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayDeque;
import java.util.Deque;
/**
 *
 * @author tiash
 */
public class DequeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println("Deque: " + dq);

        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removal: " + dq);
    
    }
    
}
