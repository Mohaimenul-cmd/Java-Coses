/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
    
    char ch;
    
     System.out.println("Enter your letter:"); 
     ch= sc.next().charAt(0);
     
     if (ch=='a' || ch=='i'|| ch=='u' || ch=='e'|| ch=='o'){
     System.out.println("Your letter is vowel");
     }
     else{
     System.out.println("Your letter is consonent");
     }
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
}
