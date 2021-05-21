
package javaapplication3;

import java.util.Scanner;
public class Ifstatementdemo4 {
    public static void main(String[] main){
    
      Scanner demo=new Scanner(System.in);
      
      
      int num;
      
      System.out.println("Enter Any Number: ");
      
      num=demo.nextInt();
      
      if(num>40){
      
            System.out.println("Passed");
                }
      else {
      
           System.out.println("fail");
      
      
      }
    
    }
}
