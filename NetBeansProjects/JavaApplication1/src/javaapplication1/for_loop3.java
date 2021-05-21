/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


public class for_loop3 {
    
   public static void main(String [] main){
   
   Scanner sc = new Scanner (System.in);
   
   int a,b;
   
   System.out.println("Enter first number: ");
   a= sc.nextInt();
   
   System.out.println("Enter second number: ");
   b=sc.nextInt();
   
   
   for (int i =a; i<=b; i++){
   
     for (int j=1; j<=10;j++){
     
     System.out.println(i+"X"+j+"="+i*j);
     }
     System.out.println("\n\n");
   }
   }
    
}
