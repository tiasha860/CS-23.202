/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author tiash
 */
public class Time2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.input();
        t2.input();

        t3.add(t1, t2);
        t3.output();
    }
}

class Time {
    int hr;
    int min;
    int sec;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours:");
        hr = sc.nextInt();

        System.out.println("Enter minutes:");
        min = sc.nextInt();

        System.out.println("Enter seconds:");
        sec = sc.nextInt();
    }

    void output() {
        System.out.println("Result:");
        System.out.println(hr + " hr " + min + " min " + sec + " sec");
    }

    void add(Time t1, Time t2) {

        sec = t1.sec + t2.sec;
        min = t1.min + t2.min + (sec / 60);
        hr  = t1.hr  + t2.hr  + (min / 60);

        sec = sec % 60;
        min = min % 60;
    }
}