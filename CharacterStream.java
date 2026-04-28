/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 import java.io.*;
/**
 *
 * @author tiash
 */
public class CharacterStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            try ( 
                    FileWriter fw = new FileWriter("charfile.txt")) {
                fw.write("Jaanleva Java");
            }

            try ( 
                    FileReader fr = new FileReader("charfile.txt")) {
                int ch;
                
                while ((ch = fr.read()) != -1) {
                    System.out.print((char) ch);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
    
    

