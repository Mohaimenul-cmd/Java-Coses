/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import java.util.Scanner;


public class Simple_code {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        int a,b;
        int sum=0,subtraction=0,multiplication=0,divition=0;
        
        System.out.println("Wnter first number:");
        a=sc.nextInt();
        
        
          System.out.println("Wnter second number:");
          b=sc.nextInt();
          
          
        sum=a+b;
        System.out.println("The sum is:"+sum);
        
    
    subtraction =a-b;
    
    System.out.println("The subtraction is: "+subtraction);
    
    multiplication =a*b;
    System.out.println("The miltiplication is:"+multiplication);
    
    divition= a/b;
      System.out.println("The divition is:"+divition);
    
    }
    
}
