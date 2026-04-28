/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
/**
 *
 * @author tiash
 */
public class ByteFilecopy {

    /**
     * @param args the command line arguments
     */
    


    public static void main(String[] args) {
        try {
            FileOutputStream fos;
            try (FileInputStream fis = new FileInputStream("source.txt")) {
                fos = new FileOutputStream("dest.txt");
                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
            }
            fos.close();

            System.out.println("File copied");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}