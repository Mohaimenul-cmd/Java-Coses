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
public class Fibonacci_Series1 {
    public static void main(String args[]){
    
    int a=0,b=1;
    System.out.println(a+" "+b);
    int c;
    for (int i=1;i<=10;i++){
          c=a+b;
          System.out.println(" "+c);
          a=b;
          b=c;
    
    }
    
    
    }
}
