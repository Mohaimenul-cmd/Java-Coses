/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_2;

import java.util.Scanner;

public class Bank{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a,b,sum=0,subtraction=0;
    
 System.out.println(" sum snd subtraction is : ");
 System.out.println(" Enter first number : ");
   a=sc.nextInt();
    
   System.out.println(" Enter second number : ");
     b=sc.nextInt();
     
     
     sum=(a+b);
     subtraction=(a-b);
     
     
      System.out.println(" The sum is : "+sum);
       System.out.println(" The subtraction is : "+subtraction);
    }  




}