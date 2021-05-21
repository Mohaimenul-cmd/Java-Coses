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
public class Array_Example {
    public static void main(String []args)
    {
    int []arr= new int []{2,5,8,4};
    
    int sum=0;
    for (int i=0; i<arr.length;i++)
    {
    sum=sum+arr[i];
    
    }
    System.out.println("The sum is:"+sum);
    
    }  
}
