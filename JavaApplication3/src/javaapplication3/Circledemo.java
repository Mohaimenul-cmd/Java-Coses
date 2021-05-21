
package javaapplication3;


import java.util.Scanner;

public class Circledemo {
    public static void main (String[] args){
    
    
    Scanner input = new Scanner(System.in);
    
    int radius;
    System.out.println("Enter Radius: ");
    radius=input.nextInt();
    
    double area = (double)3.1416*radius*radius;
    
    System.out.println("Area is : "+area);
    
    }
    
}
