/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int week;
        String day="0";
        
        System.out.println("Enter day number:");
        week = sc.nextInt();
        
        switch(week){
        
        case 1:
            
            day ="sunday";
        break;
        case 2:
           day = "monday";
           break;
        case 3:
             day = "monday";
             break;
        case 4:
             day = "monday";
             break;
        case 5:
             day = "monday";
        case 6:
             day = "monday";
        case 7:
            day = "monday";
            Invalid : 
             day = "monday";
            
        
        
        
        
    }
         System.out.println("the day is :"+ day);
        
    }

}