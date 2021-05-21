/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class UserInput {
   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   
   int a,b;
   int sum=0, subtraction=0,multiply=0;
   
   System.out.println("Enter first number:");
   a=sc.nextInt();
   
   System.out.println("Enter second number:");
   b=sc.nextInt();
   
   sum= a+b;
   System.out.println("The sum is : "+sum);
   
   subtraction=a-b;
    System.out.println("The subtaction is : "+subtraction);
   
   multiply=a*b;
    System.out.println("The multiply is : "+multiply);
   
   
   
   
   }
        
       
        
       
}
