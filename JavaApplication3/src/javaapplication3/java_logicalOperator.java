/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class java_logicalOperator {
    
  public static void main(String[] args){
  
 
      Scanner sc = new Scanner(System.in);
      
      
      int a,b,sum=0,subtraction=0;
      
     System.out.println("Enter first Number: (Press 1 for sum 2 for subtraction)");
     a=sc.nextInt();
              
     if(a==1){
     
     System.out.println("Welcome to sum..plese input numbers");
     System.out.println("Enter first number:");
      a=sc.nextInt();
      
      System.out.println("Entre Second number: ");
     b=sc.nextInt();
     
     
     sum = a+b;
     System.out.println("The sum is:"+sum);
     
     }
      
     else if (a==2){
     
     
     System.out.println("Enter first number: ");
     a=sc.nextInt();
     
     System.out.println("Enter Second Number:");
     b=sc.nextInt();
     
     subtraction= a-b;
     
     
     System.out.println("The subtracton is :"+subtraction);
     
     }
     else if (a<=3 || a==0){
  
  System.out.println("can not recognise");
  
  
  }
     else
             {
             System.out.println("thank you");
             
             }
     
     
   }
    
}
