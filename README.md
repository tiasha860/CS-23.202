# CS-23.202
[Program-1 Collect any 5 codes in C language like factorial ,armstrong,palindrome etc and convert them in object oriented in java and test the result in the main](#Assignment-1)

[Program 2-Write a class to reverse an 1D array with necessary methods](#Assignment-2)

[Program3-Write a class for addition of two distances where each distance is given in m, cm and mm](#Assignment-3)

[Program 4- Write a class for addition of two times where each time is given in hr, min and sec](#Assignment-4)

[Program-5 Write a class for addition of two times where each timee is given in hr and min](#Assignment-5)

[Program 6- Write a Java program to demonstrate the use of ArrayList by performing operations such as adding elements, removing elements, searching for an element, updating elements, and iterating through the list.](#Assignment-6)

[Program 7 -Write a Java program to implement LinkedList and perform insertion at the beginning, middle, and end, along with deletion, searching, and displaying the elements.](#Assignment-7)

[Program 8- Write a Java program to demonstrate Stack operations using the Collection Framework, including push, pop, peek, and checking whether the stack is empty.](#Assignment-8)

[Program 9- Write a Java program to implement HashMap and perform operations such as inserting key-value pairs, retrieving values using keys, removing entries, and iterating through the map.](#Assignment-9)

[Program 10- Write a Java program to demonstrate Hashtable ](#Assignment-10)

[Program 11- Implement File transfer/copy in Java using:Byte Stream](#Assignment-11)

[Program 12- Implement File transfer/copy in Java using:Character Stream](#Assignment-12)

[Program-13 Implement a Java class Division with methods for integer division, floating-point division, division with remainder, and dividing multiple numbers by a given divisor. Ensure division by zero is properly handled with exceptions.](#Assignment-13)

[Program-14 Create a parent class and two child class having same method which override it in both child classes. Call the methods using a parent class reference.](#Assignment-14)

[Program 15- Implement File transfer/copy in Java using:Primitive Data Stream](#Assignment-15)

[Program-16 Write a Java program consisting of three classes, where each class contains a method. Each method should print numbers from 1 to 100 along with the class name.](#Assignment-16)

[Program-17 Using three different classes and methods, write a Java program to print numbers from 1 to 10: Without using threads analyze and display the result](#Assignment-17)

[Program-18 Repeat above program 17 using the Runnable interface.](#Assignment-18)

[Program 19- Write a Java Swing program that creates a GUI with buttons to draw and fill shapes (rectangle, oval) and change their colors (red, black) using the Graphics class.](#Assignment-19)

[Program 20-Write a class for Dequeue](#Assignment-20)

[Program 21-Write a class for Queue](#Assignment-21)

[Program 22-Write a class for Matrix Operations](#Assignment-22)






## Assighnment-1
***

import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class AllProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Operations obj = new Operations();

        obj.factorial();
        obj.armstrong();
        obj.swap();
        obj.reverse();
        obj.prime();
    }
}

class Operations {

    Scanner sc = new Scanner(System.in);

    void factorial() {
        System.out.println("\n--- Factorial ---");
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i=1; i<=n; i++)
            fact *= i;

        System.out.println("Factorial = " + fact);
    }

    void armstrong() {
        System.out.println("\n--- Armstrong ---");
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0, r, temp = n;

        while(n > 0) {
            r = n % 10;
            sum += r*r*r;
            n /= 10;
        }

        if(sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }

    void swap() {
        System.out.println("\n--- Swap ---");
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a=" + a + " b=" + b);
    }

    void reverse() {
        System.out.println("\n--- Reverse Number ---");
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();

        int rev = 0, r;

        while(n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        System.out.println("Reverse = " + rev);
    }

    void prime() {
        System.out.println("\n--- Prime Number ---");
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int flag = 1;

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                flag = 0;
                break;
            }
        }

        if(flag == 1 && n > 1)
            System.out.println("Prime number");
        else
            System.out.println("Not Prime");
    }
}
    
 ***   

<img width="664" height="517" alt="image" src="https://github.com/user-attachments/assets/80c6220a-97c2-415c-a539-82f7c4a71461" />




## Assighnment-2
***

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
***    
 <img width="691" height="478" alt="image" src="https://github.com/user-attachments/assets/9c11c8ea-5813-435c-8f82-65544539b431" />
   

## Assighnment-3
***
import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class Dist2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance d3 = new Distance();

        d1.input();
        d2.input();

        d3.add(d1, d2);
        d3.output();
    }
}

class Distance {
    int m;
    int cm;
    int mm;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter meters:");
        m = sc.nextInt();

        System.out.println("Enter centimeters:");
        cm = sc.nextInt();

        System.out.println("Enter millimeters:");
        mm = sc.nextInt();
    }

    void output() {
        System.out.println("Result:");
        System.out.println(m + " m " + cm + " cm " + mm + " mm");
    }

    void add(Distance o1, Distance o2) {

        mm = o1.mm + o2.mm;
        cm = o1.cm + o2.cm + (mm / 10);
        m  = o1.m  + o2.m  + (cm / 100);

        mm = mm % 10;
        cm = cm % 100;
    }
}
***

<img width="577" height="489" alt="image" src="https://github.com/user-attachments/assets/7da2658e-dbac-4510-ab1e-6c534ff04dd9" />


## Assighnment-4
***
import java.util.Scanner;

/**
 *
 * @author tiash
 */
public class Time2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.input();
        t2.input();

        t3.add(t1, t2);
        t3.output();
    }
}

class Time {
    int hr;
    int min;
    int sec;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours:");
        hr = sc.nextInt();

        System.out.println("Enter minutes:");
        min = sc.nextInt();

        System.out.println("Enter seconds:");
        sec = sc.nextInt();
    }

    void output() {
        System.out.println("Result:");
        System.out.println(hr + " hr " + min + " min " + sec + " sec");
    }

    void add(Time t1, Time t2) {

        sec = t1.sec + t2.sec;
        min = t1.min + t2.min + (sec / 60);
        hr  = t1.hr  + t2.hr  + (min / 60);

        sec = sec % 60;
        min = min % 60;
    }
}
***

<img width="488" height="453" alt="image" src="https://github.com/user-attachments/assets/b91582c3-44bd-4289-91da-35eb91e5835f" />

## Assighnment-5
***

import java.util.Scanner;
/**
 *
 * @author tiash
 */
public class Program5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

class Time {
    int hr, min;
// Method to input time
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        min = sc.nextInt();
    }

    // Method to add two times
    void add(Time t1, Time t2) {
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;

        // Convert minutes to hours if >= 60
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
    }

    // Display result
    void display() {
        System.out.println("Time = " + hr + " hours " + min + " minutes");
    }
}

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        System.out.println("Enter First Time:");
        t1.input();

        System.out.println("Enter Second Time:");
        t2.input();

        result.add(t1, t2);

        System.out.println("Sum of Times:");
        result.display();
    }
}
    
***

<img width="562" height="472" alt="image" src="https://github.com/user-attachments/assets/973ca92d-e6a9-4832-9dbb-0ecb625e3e42" />


## Assighnment-6
***

import java .util.*;
/**
 *
 * @author tiash
 */
public class ArraylistDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Initial List: " + list);

        
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        
        if (list.contains("Mango")) {
            System.out.println("Mango is found in the list");
        } else {
            System.out.println("Mango not found");
        }

        
        list.set(1, "Grapes"); // replaces Mango
        System.out.println("After updating index 1: " + list);

        
        System.out.println("Iterating using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
***

<img width="512" height="461" alt="image" src="https://github.com/user-attachments/assets/75f72d60-892f-4453-8342-691d4d7d6a8f" />


## Assighnment-7
***
import java.util.*;

/**
 *
 * @author tiash
 */
public class LinkedlistDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        LinkedList<String> list = new LinkedList<>();

        
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        
        list.addFirst("Orange");

        
        list.add(2, "Grapes");

        System.out.println("After Insertions: " + list);

        
        list.remove("Banana");   
        list.remove(1);          

        System.out.println("After Deletions: " + list);

        
        if (list.contains("Mango")) {
            System.out.println("Mango is found in the list");
        } else {
            System.out.println("Mango not found");
        }

        
        System.out.println("Displaying elements:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
***

<img width="493" height="403" alt="image" src="https://github.com/user-attachments/assets/80365944-b391-472b-be96-4020cfb8ef79" />


## Assighnment-8
***

import java.util.*;
/**
 *
 * @author tiash
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        
        System.out.println("Top element: " + stack.peek());

        
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
 ***
<img width="555" height="385" alt="image" src="https://github.com/user-attachments/assets/940b1f84-99c7-4048-9c43-e8328e276442" />

## Assighnment-9
***
import java .util.HashMap;
/**
 *
 * @author tiash
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("HashMap: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);
        System.out.println("After removal: " + map);

        System.out.println("Iterating elements:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
***

<img width="518" height="389" alt="image" src="https://github.com/user-attachments/assets/c371072c-c088-4b27-ba37-017dfa30b953" />

## Assighnment-10
***
import java.util.Hashtable;
/**
 *
 * @author tiash
 */
public class HashtableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(10, "A");
        ht.put(20, "B");

        System.out.println(ht.get(10));    
    }
    
}
***
<img width="506" height="391" alt="image" src="https://github.com/user-attachments/assets/4cfaf562-6ea7-4e22-8f65-b445c2901f35" />



## Assighnment-11
***

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
***

<img width="478" height="290" alt="image" src="https://github.com/user-attachments/assets/2710ffbe-37e2-49cd-b694-44fbc7de09a7" />



## Assighnment-12
***

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
    
***
<img width="497" height="360" alt="image" src="https://github.com/user-attachments/assets/1ae5b5b1-85e6-4ae7-8671-2bc55ddfe8e5" />

## Assighnment-14
***
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
    
***
<img width="512" height="444" alt="image" src="https://github.com/user-attachments/assets/7511ac82-009e-49d0-98b5-efb01574a602" >

 
## Assighnment-14
***
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

***
<img width="593" height="395" alt="image" src="https://github.com/user-attachments/assets/1f129f27-f60c-4a91-a752-e072c55af495" />

## Assighnment-15
***

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

***    
<img width="572" height="400" alt="image" src="https://github.com/user-attachments/assets/b7c0b00f-bc02-4d9e-8639-d25d0fd77c2e" />

## Assighnment-16
***
public class Program16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class ClassA {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("ClassA: " + i);
        }
    }
}

class ClassB {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("ClassB: " + i);
        }
    }
}

class ClassC {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
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
    
***
<img width="467" height="350" alt="image" src="https://github.com/user-attachments/assets/e5586623-0fd7-4047-8423-67cababb7da7" />
 
## Assighnment-17
***

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
 ***  
 
<img width="537" height="478" alt="image" src="https://github.com/user-attachments/assets/b875e451-fc95-4f3f-8bdc-3d2a3eed70e1" />

    
## Assighnment-18
***
public class Program18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class MyRunnable implements Runnable {

    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

        Thread t1 = new Thread(new MyRunnable("Thread1"));
        Thread t2 = new Thread(new MyRunnable("Thread2"));
        Thread t3 = new Thread(new MyRunnable("Thread3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
    
***    
<img width="500" height="418" alt="image" src="https://github.com/user-attachments/assets/3e9e08f5-d039-4c3a-ac96-3684ccdcccf5" />

## Assighnment-19
***
public class Shapes extends javax.swing.JFrame {
String shape = "";
java.awt.Color color = java.awt.Color.BLACK;
    /**
     * Creates new form Shapes
     */
    public Shapes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Rectangle ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Oval");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Red");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Black");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(42, 42, 42)
                                .addComponent(jButton2)
                                .addGap(25, 25, 25)
                                .addComponent(jButton3)
                                .addGap(49, 49, 49)
                                .addComponent(jButton4)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        shape = "rect";
    repaint();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        shape = "oval";
    repaint();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        color = java.awt.Color.RED;
    repaint();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        color = java.awt.Color.BLACK;
    repaint();
    }                                        
     @Override
public void paint(java.awt.Graphics g) {
    super.paint(g);

    g.setColor(color);

    if (shape.equals("rect")) {
        g.fillRect(100, 150, 150, 80);
    } else if (shape.equals("oval")) {
        g.fillOval(100, 150, 150, 80);
    }
} 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shapes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
***
<img width="460" height="354" alt="image" src="https://github.com/user-attachments/assets/b88b5910-1b68-4389-bca6-3d7b98cc7bc6" />
<img width="382" height="320" alt="image" src="https://github.com/user-attachments/assets/3e488c3b-afa5-48f9-8228-03e659867e15" />
<img width="446" height="349" alt="image" src="https://github.com/user-attachments/assets/0eece036-0685-4734-8934-5866575c822a" />
<img width="500" height="349" alt="image" src="https://github.com/user-attachments/assets/5e3adc4d-71af-446d-8bd0-ef1cb93f67c2" />

## Assighnment-20
***
import java.util.ArrayDeque;
import java.util.Deque;
/**
 *
 * @author tiash
 */
public class DequeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println("Deque: " + dq);

        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removal: " + dq);
    
    }
    
}
***
<img width="531" height="229" alt="image" src="https://github.com/user-attachments/assets/334fe5a7-4852-42f4-9280-9c510f89c929" />

## Assighnment-21
***
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author tiash
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        System.out.println("Head: " + q.peek());

        q.poll();

        System.out.println("After removal: " + q);    
    }
    
}
***
<img width="545" height="353" alt="image" src="https://github.com/user-attachments/assets/1dc6ae43-3db7-4328-89ad-0efdc2b6245c" />


## Assighnment-22
***
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
***
<img width="570" height="469" alt="image" src="https://github.com/user-attachments/assets/9c369266-5a87-4b6e-8014-76d7c92e6522" />

    



