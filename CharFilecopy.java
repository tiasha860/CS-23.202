/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
/**
 *
 * @author tiash
 */
public class CharFilecopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter fw;
            try (FileReader fr = new FileReader("source.txt")) {
                fw = new FileWriter("dest.txt");
                int ch;
                while ((ch = fr.read()) != -1) {
                    fw.write(ch);
                }
            }
            fw.close();

            System.out.println("File copied");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
