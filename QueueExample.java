/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author tiash
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        System.out.println("Head: " + q.peek());

        q.poll();

        System.out.println("After removal: " + q);    
    }
    
}
