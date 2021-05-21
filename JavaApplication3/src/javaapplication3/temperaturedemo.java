
package javaapplication3;

import java.util.Scanner;

public class temperaturedemo {
    
    public static void main(String[] main){
    
    Scanner input = new Scanner(System.in);
    double fer;
    
    
    System.out.println("Enter farherheight: ");
    fer=input.nextDouble();
    
   fer=(double)0.5*(fer-32);
    
    System.out.println("Celcious is : "+fer);
    }
}
