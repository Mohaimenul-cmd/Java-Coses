/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
/**Problem is == 1 + 2 + 3 + ......+n
 * Problem is == 1*2*3*4*5*......*n
 *
 * @author mahad
 */
public class Series_1 {
  public static void main(String [] args){
  
  Scanner sc= new Scanner (System.in);
  int a,result=1;
  
  System.out.println("Enter your number: ");
  a=sc.nextInt();
  
  for (int i=1; i<=a;i++){
  
  System.out.println(i+" ");
  
  result=result*i;
  }
  
  System.out.println("Result is :"+result);
  }
  
  
    
    
    }
   
    
    
