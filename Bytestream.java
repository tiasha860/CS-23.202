/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
/**
 *
 * @author tiash
 */
public class Bytestream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            try ( // Writing
                    FileOutputStream fos = new FileOutputStream("bytefile.txt")) {
                fos.write("Tiasha and Sia are best friends".getBytes());
            }

            try ( // Reading
                    FileInputStream fis = new FileInputStream("bytefile.txt")) {
                int b;
                
                while ((b = fis.read()) != -1) {
                    System.out.print((char) b);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
    
    

