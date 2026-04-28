/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class MatrixOps {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        Matrix result = new Matrix();

        m1.input();
        m2.input();

        result.add(m1, m2);
        result.output("Addition");

        result.multiply(m1, m2);
        result.output("Multiplication");

        m1.transpose();
        m1.output("Transpose of First Matrix");

        m1.sumRows();
        m1.sumCols();
        m1.sumDiagonals();
    }
}

class Matrix {
    int a[][] = new int[2][2];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:");

        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                a[i][j] = sc.nextInt();
    }

    void add(Matrix m1, Matrix m2) {
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                a[i][j] = m1.a[i][j] + m2.a[i][j];
    }

    void multiply(Matrix m1, Matrix m2) {
        int temp[][] = new int[2][2];

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                temp[i][j]=0;
                for(int k=0;k<2;k++) {
                    temp[i][j]+= m1.a[i][k]*m2.a[k][j];
                }
            }
        }
        a = temp;
    }

    void transpose() {
        for(int i=0;i<2;i++) {
            for(int j=i+1;j<2;j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    void sumRows() {
        for(int i=0;i<2;i++) {
            int sum=0;
            for(int j=0;j<2;j++)
                sum += a[i][j];
            System.out.println("Row " + i + " sum = " + sum);
        }
    }

    void sumCols() {
        for(int j=0;j<2;j++) {
            int sum=0;
            for(int i=0;i<2;i++)
                sum += a[i][j];
            System.out.println("Column " + j + " sum = " + sum);
        }
    }

    void sumDiagonals() {
        int d1=0, d2=0;

        for(int i=0;i<2;i++) {
            d1 += a[i][i];
            d2 += a[i][1-i];
        }

        System.out.println("Primary diagonal sum = " + d1);
        System.out.println("Secondary diagonal sum = " + d2);
    }

    void output(String msg) {
        System.out.println(msg + ":");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
    
    

