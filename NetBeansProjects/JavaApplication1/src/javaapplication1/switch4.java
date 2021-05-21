/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;




public class switch4 {
    
    public static void main(String[] args){
    
        int month = 7;
        String monthString = "0";
        
        switch ( month ){
            case 1:
                monthString = "1- january";
            case 2:
                monthString = "2-February";
                  case 3:
                monthString = "2-February";
                  case 4:
                monthString = "2-February";
                  case 5:
                monthString = "2-February";
                  case 6:
                monthString = "2-February";
                  case 7:
                monthString = "6";
                break;
                  default:
                      monthString="Invalid month";
    
    
    }
    System.out.println("the month is:"+monthString);
    }
    
}
