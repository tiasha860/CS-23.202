# CS-23.202
[Program-1 Collect any 5 codes in C language like factorial ,armstrong,palindrome etc and convert them in object oriented in java and test the result in the main](#Assignment-1)

[Program 2-Write a class to reverse an 1D array with necessary methods](#Assignment-2)

[Program3-Write a class for addition of two distances where each distance is given in m, cm and mm](#Assignment-3)

[Program 4- Write a class for addition of two times where each time is given in hr, min and sec](#Assignment-4)





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




