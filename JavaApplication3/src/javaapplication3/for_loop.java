/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
public class for_loop {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("enter your digit:");
    int x= sc.nextInt();
    int result=0;
    
    for (int i=1; i<=10;i++){
        result = x*i;
    
    System.out.println(x+"X"+i+"="+result);
    }
    
    
    
    
    }
}
