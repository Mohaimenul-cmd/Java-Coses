
package javaapplication3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
    
    //Scanner input = new Scanner(System.in);
    Scanner input=new Scanner (System.in);
    
    int base,height;
    
    System.out.println("Enter your Base: ");
    base=input.nextInt();
    
    System.out.println ("Enter your Height: ");
    height=input.nextInt();
    
    double area=(double)0.5*base*height;  //type casting 
    
    System.out.println("Area is : "+area);
    
    
    }
    
}
