
package javaapplication3;

import java.util.Scanner;

public class Switchdemo1 {
    
    public static void main(String[] args){
        
    Scanner demo = new Scanner(System.in);  
    
     int digit,num1,num2,result;
     double result1;
     char ch;
    
         System.out.print("Press numbers for following Actions");
          
       
          
          System.out.println("1.sum; 2.subtraction 3. divide 4.Multiplication");
         
            digit= demo.nextInt();
            
          switch(digit){
                case 0:
                    
        System.out.println("one");
        
            break;
            
        case 1:
            
            System.out.println("Do Sum of numbers");
            System.out.println("Enter number 1:");
            num1=demo.nextInt();
            System.out.println("Enter number 2");
            num2=demo.nextInt();
            
            result=num1+num2;
            
            System.out.println("The sum is :"+result);
            
            break;
            
        case 2:
            
            System.out.println("Do Subtraction of numbers");
            
            System.out.println("Enter number 1:");
            num1=demo.nextInt();
            System.out.println("Enter number 2:");
            num2 = demo.nextInt();
            
            result=num1-num2;
            
            System.out.println("The Subtraction is: "+result);
            
            
            break;
        case 3: 
            System.out.println("DO Divide for numbers");
            System.out.println("Enter number 1");
            num1=demo.nextInt();
            System.out.println("Enter number 2:");
            num2=demo.nextInt();
            
            result1=(double)num1/num2;
            
            System.out.println("The devide result is: "+result1);
            
        case 4:
            System.out.println("Do Multiplication number");
            System.out.println("Enter 1st number:");
            
            
            
            
        default:
            
            System.out.println("not a digit");
            
    } 
          
    }  
    
}