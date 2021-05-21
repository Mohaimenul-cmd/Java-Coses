/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**1X2X3X4X.........Series Problems
 *
 * @author mahad
 */
public class Series_3 {
    
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int a,multiplication=1;
    
    System.out.print("Enter YOur number:");
    a=sc.nextInt();
    
    for (int i=1; i<=a; i++){
    
        System.out.print(i+" ");
        
    multiplication= multiplication *i; 
    
    
    }
    
    System.out.println(multiplication);
    
    }
}
