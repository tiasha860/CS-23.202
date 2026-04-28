/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class Dist2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance d3 = new Distance();

        d1.input();
        d2.input();

        d3.add(d1, d2);
        d3.output();
    }
}

class Distance {
    int m;
    int cm;
    int mm;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter meters:");
        m = sc.nextInt();

        System.out.println("Enter centimeters:");
        cm = sc.nextInt();

        System.out.println("Enter millimeters:");
        mm = sc.nextInt();
    }

    void output() {
        System.out.println("Result:");
        System.out.println(m + " m " + cm + " cm " + mm + " mm");
    }

    void add(Distance o1, Distance o2) {

        mm = o1.mm + o2.mm;
        cm = o1.cm + o2.cm + (mm / 10);
        m  = o1.m  + o2.m  + (cm / 100);

        mm = mm % 10;
        cm = cm % 100;
    }
}