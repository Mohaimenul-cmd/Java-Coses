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
public class FibonacciExample1 {
    public static void main(String [] args){
    
    int x=0,y=1,n,count=10;
    System.out.println(x+"   "+y);
    
    for(int i=2;i<count;++i){
    
    n=x+y;
    System.out.println(" "+n);
    x=y;
    y=n;
    
    }
    
    
    }
}
