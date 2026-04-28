/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tiash
 */
public class threeclassmethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class ClassA {
    void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ClassA: " + i);
        }
    }
}

class ClassB {
    void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ClassB: " + i);
        }
    }
}

class ClassC {
    void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("ClassC: " + i);
        }
    }
}


        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.printNumbers();
        b.printNumbers();
        c.printNumbers();
    }
}
    
    

