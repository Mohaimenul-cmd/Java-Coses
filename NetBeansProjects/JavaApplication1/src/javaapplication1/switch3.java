/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class switch3 {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    int Daynumber;
    String day;
    System.out.println("Enter your day:");
    Daynumber = sc.nextInt();
    
    
    switch(Daynumber){
    
        case 1:
            day="sunday";
        case 2:
            day ="monday";
        case 3:
            day ="tuesday";
        case 4:
            day="wednessday";
        case 5:
            day = "thursday";
            case 6:
            day = "thursday";
            
            case 7:
                
            day = "thursday";
            default:
                
            day = "invalid day";
            
      
    
    
    
    }
    System.out.println("The day is:"+day);
    
    
    }
    
}
