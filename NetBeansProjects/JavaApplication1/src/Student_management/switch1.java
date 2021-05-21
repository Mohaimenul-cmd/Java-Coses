/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_management;

import java.util.Scanner;
public class switch1 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int month;
    String monthString="0";
    
    System.out.println("Enter the month number:");
    month=sc.nextInt();
    
    switch(month){
        case 1:
            monthString ="1-january";
            break;
        case 2:
            monthString="2-February";
             break;
             case 3:
            monthString="3-March";
             break;
             case 4:
            monthString="4-April";
             break;
             case 5:
            monthString="5-May";
             break;
             case 6:
            monthString="6-june";
             break;
             case 7:
            monthString="7-july";
             break;
             case 8:
            monthString="8-augusu";
             break;
             case 9:
            monthString="9-September";
             break;
             case 10:
            monthString="10-October";
             break;
             case 11:
            monthString="11-November";
             break;
             case 12:
            monthString="12-December";
             break;
             default:
            monthString="Invalid month";
             break;
            
    
    
    }
    System.out.println(monthString);
    
    
    }
}
