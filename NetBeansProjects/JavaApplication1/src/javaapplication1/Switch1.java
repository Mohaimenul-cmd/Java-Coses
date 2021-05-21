/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args){
    
    
    Scanner sc = new Scanner(System.in);
    
    char ch ;
    
    System.out.println("Enter your letter:");
    ch=sc.next().charAt(0);
    
    
    switch(ch){
    
    
        case 'a':
            System.out.println("vowel");
            break;
             case 'e':
            System.out.println("vowel");
            break;
             case 'i':
            System.out.println("vowel");
            break;
             case 'o':
            System.out.println("vowel");
            break;
             case 'u':
            System.out.println("vowel");
            break;
             default :
            System.out.println("consonent");
            break;
    
    
    
    
    
    
    
    
    
    }
    
    
    
    }
    
    
    
   
}
