/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tiash
 */
public class ParentChildclass {

  

    
    static class Parent {
        void show() {
            System.out.println("This is Parent class method");
        }
    }

    
    static class Child1 extends Parent {
        @Override
        void show() {
            System.out.println("This is Child1 class method");
        }
    }

    
    static class Child2 extends Parent {
        @Override
        void show() {
            System.out.println("This is Child2 class method");
        }
    }

    public static void main(String[] args) {

        Parent obj;

        obj = new Child1();
        obj.show();

        obj = new Child2();
        obj.show();
    }
}