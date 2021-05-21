/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class if_else2 {
        public static void main(String[] args){
    
    Scanner sc = new Scanner (System.in);
    
    //Pass or Fail program
    
    int a,b;
    
    System.out.println("Welcome to pass or fail....put your number bellow");
    a=sc.nextInt();
    
    if(a==50 || a>=50 ){
    
    System.out.println("You have passed");
    
    
    }
    else if (a<50){
    
    System.out.println("You have failed");
    
    
    }
    else{
        System.out.println("Not Recognised");
    
    
    
    }
    
    
    }
}
