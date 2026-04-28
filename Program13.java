/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tiash
 */
public class Program13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class Division {

    // Integer division
    int divideInt(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Floating point division
    double divideFloat(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Division with remainder
    int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a % b;
    }

    // Divide multiple numbers by a given divisor
    void divideArray(int[] arr, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        System.out.println("Dividing array elements:");
        for (int num : arr) {
            System.out.println(num + " / " + divisor + " = " + (num / divisor));
        }
    }
}


        Division d = new Division();

        try {
            System.out.println("Integer Division: " + d.divideInt(10, 2));
            System.out.println("Float Division: " + d.divideFloat(10.5, 2.5));
            System.out.println("Remainder: " + d.remainder(10, 3));

            int[] numbers = {10, 20, 30, 40};
            d.divideArray(numbers, 2);

            // Test division by zero
            System.out.println(d.divideInt(5, 0)); // will throw exception

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    
    

