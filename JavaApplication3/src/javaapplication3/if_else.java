/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import java.util.Scanner;

public class if_else {
    
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
    
    int i,a,b,sum=0,subtraction=0;
    
    System.out.println("Enter 1 for sum and 2 for subtraction: ");
    
    i=sc.nextInt();
    
    if(i==1){
    
    System.out.println("Enter two numbers for sum-");
    
    System.out.println("Enter first number: ");
    a=sc.nextInt();
    
    System.out.println("Enter Second number: ");
    b=sc.nextInt();
    
    sum= a+b;
    
    System.out.println("The sum is :"+sum);
    
    
   
    
    }
    else if(i==2){
    
    System.out.println("Enter two numbers for subtraction-");
    
    System.out.println("Enter first number:");
    a=sc.nextInt();
    
    System.out.println("Enter second number:");
    b=sc.nextInt();
    
    subtraction= a-b;
    
    System.out.println("The subtraction is: "+subtraction);
    
    
    }
    else if (i==0 ){
    
    System.out.println("Digit is not recognised");
    
    }
    
    }
       
    
}
