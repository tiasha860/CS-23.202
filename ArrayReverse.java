/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class ArrayReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Array1D a = new Array1D();

        a.input();
        a.reverse();
        a.output();
    }
}

class Array1D {
    int arr[];
    int n;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void reverse() {
        for(int i=0; i<n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    void output() {
        System.out.println("Reversed Array:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    
    

