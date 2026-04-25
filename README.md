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
<img width="475" height="434" alt="image" src="https://github.com/user-attachments/assets/60fdd907-94a3-4ee7-87eb-80208e742c57" />



    
