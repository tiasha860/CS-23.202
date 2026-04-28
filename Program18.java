/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tiash
 */
public class Program18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class MyRunnable implements Runnable {

    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}



        Thread t1 = new Thread(new MyRunnable("Thread1"));
        Thread t2 = new Thread(new MyRunnable("Thread2"));
        Thread t3 = new Thread(new MyRunnable("Thread3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
    
    

