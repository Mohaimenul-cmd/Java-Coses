
package javaapplication1;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        String levelString ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter your level string:");
        levelString = sc.next();
        
        int level =0;
        
        switch(levelString){
        
            case "Beginner": 
                
                level =1;
                break;
                
            case  "Intermediate":
                level=2;
                break;
                
            case "Expert":
                level=3;
                
                break;
                
            default:
                level=0;
              break;
        
        
        }
        System.out.println("Your level is :"+level);
    }
}
