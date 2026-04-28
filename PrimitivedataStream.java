/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
/**
 *
 * @author tiash
 */
public class PrimitivedataStream {

    /**
     * @param args
     */


    public static void main(String[] args) {
        try {
            try ( // Writing
                    DataOutputStream dos = new DataOutputStream(
                            new FileOutputStream("data.txt"))) {
                dos.writeInt(101);
                dos.writeDouble(99.99);
                dos.writeBoolean(true);
            }

            try ( 
                    DataInputStream dis = new DataInputStream(
                            new FileInputStream("data.txt"))) {
                System.out.println(dis.readInt());
                System.out.println(dis.readDouble());
                System.out.println(dis.readBoolean());
            }

        } catch (IOException e) {
            System.out.println(e);
        }  
    }
}

    
