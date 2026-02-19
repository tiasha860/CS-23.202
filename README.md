# CS-23.202
##assi-1
```
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author IBM5
 */
import java.util.Scanner;

public class Array_test {
    
           
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
class at{
    int arr[];
    int rev[];
    
    
    void input(){
        arr= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 elements");
        for(int i=0;i<=4;i++){
            arr[i]=sc.nextInt();
        }
        
    }
    void output(){
        System.out.println("Array:");
        for (int i= 0; i<5; i++){
            System.out.print(arr[i] +" ");
    }
        System.out.println();
    
}
    
 void reverse(){
     for(int i=0;i<5;i++){
         rev[4-i]= arr[i];
         
     }
 }
    

}
```

<img width="1257" height="442" alt="image" src="https://github.com/user-attachments/assets/417a737e-38a8-40ae-8136-1ed5b3dfcf2f" />













