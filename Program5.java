/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class Program5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

class Time {
    int hr, min;
// Method to input time
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
    }

    // Method to add two times
    void add(Time t1, Time t2) {
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;

        // Convert minutes to hours if >= 60
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
    }

    // Display result
    void display() {
        System.out.println("Time = " + hr + " hours " + min + " minutes");
    }
}

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        System.out.println("Enter First Time:");
        t1.input();

        System.out.println("Enter Second Time:");
        t2.input();

        result.add(t1, t2);

        System.out.println("Sum of Times:");
        result.display();
    }
}
    
    

