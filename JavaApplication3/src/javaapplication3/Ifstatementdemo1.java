/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;


public class Ifstatementdemo1 {
    
    
    public static void main(String[] args){
   
    
    Scanner demo = new Scanner(System.in);
    
    int num;
    
    System.out.println("Enter Any number: ");
    
    num=demo.nextInt();
    
    if(num%2==0){
    
    System.out.println("This is an Even number");
    
    }
    else{
    System.out.println("This is a odd number");
    
    }
  
    
    
    
    
    }
    
}
