/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Arithmatic_operator{
   public static void main(String[] args){       
   
    Scanner sc = new Scanner(System.in);
    
    int a,b;
    int sum,subtraction,multiplication, divition;
    
   System.out.println("Enter your first number:");
   a=sc.nextInt();
    
    System.out.println("Enter your sencond number:");
    b=sc.nextInt();
    
    sum = a+b;
     System.out.println("The sum is :"+sum);
     
     
     subtraction =a-b;
      System.out.println("The subtraction is :"+subtraction);
     
      multiplication =a*b;
       System.out.println("The multiplication is :"+multiplication);
       
       divition= a/b;
        System.out.println("The divition is :"+divition);
      
     
   }
   
}
