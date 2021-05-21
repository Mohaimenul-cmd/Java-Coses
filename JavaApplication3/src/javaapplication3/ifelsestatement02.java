
package javaapplication3;


import java.util.Scanner;
public class ifelsestatement02 {
    
    public static void main(String[] args){
    
     Scanner demo = new Scanner(System.in);
     
     int num;
     System.out.println("Enter Your Number: ");
     
     num = demo.nextInt();
     
     if(num<100){
     
             System.out.println("This is a minimum Number");
         
                }
     else if(num==100){
    
             System.out.println("This is a equal Number");         
                      }
    
     else {
     
           System.out.println("This number is Maximum Number");
     
          }
    }
    
}
