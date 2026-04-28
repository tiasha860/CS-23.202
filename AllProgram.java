/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class AllProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Operations obj = new Operations();

        obj.factorial();
        obj.armstrong();
        obj.swap();
        obj.reverse();
        obj.prime();
    }
}

class Operations {

    Scanner sc = new Scanner(System.in);

    void factorial() {
        System.out.println("\n--- Factorial ---");
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i=1; i<=n; i++)
            fact *= i;

        System.out.println("Factorial = " + fact);
    }

    void armstrong() {
        System.out.println("\n--- Armstrong ---");
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0, r, temp = n;

        while(n > 0) {
            r = n % 10;
            sum += r*r*r;
            n /= 10;
        }

        if(sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }

    void swap() {
        System.out.println("\n--- Swap ---");
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a=" + a + " b=" + b);
    }

    void reverse() {
        System.out.println("\n--- Reverse Number ---");
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();

        int rev = 0, r;

        while(n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        System.out.println("Reverse = " + rev);
    }

    void prime() {
        System.out.println("\n--- Prime Number ---");
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int flag = 1;

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                flag = 0;
                break;
            }
        }

        if(flag == 1 && n > 1)
            System.out.println("Prime number");
        else
            System.out.println("Not Prime");
    }
}
    
    

