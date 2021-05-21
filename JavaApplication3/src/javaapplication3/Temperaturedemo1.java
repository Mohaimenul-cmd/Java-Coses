/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class Temperaturedemo1 {
    
    public static void main(String[] args){
    
      Scanner input = new Scanner(System.in);
      double celcious;
      
      System.out.println("Type your celcious: ");
      celcious=input.nextDouble();
      
      double fran=1.8*celcious+32;
    System.out.println("Farenheight: "+fran);
    
    }
    
}
