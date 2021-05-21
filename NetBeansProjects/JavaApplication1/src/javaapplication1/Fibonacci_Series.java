/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mahad
 */
public class Fibonacci_Series {
    public static void main(String args[]){
    
    int a=0,b=1;
    int c;
    System.out.println(a+"  "+b);
    for(int i=1;i<=10;i++){
      c=a+b;
      System.out.println(""+c);
      a=b;
      b=c;
    
    
    
    }
    
    
    }
    
    
}
