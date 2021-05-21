
package javaapplication3;

import java.util.Scanner;
public class LogicalOperatordemo2 {
    public static void main(String[] args){
    
    Scanner demo  = new Scanner (System.in);
    
    char ch,ch1;
    System.out.println("Enter any letter:");
    
   ch = demo.next().charAt(0);
   
   if(ch>='a' && ch<='z'){
    
    System.out.println("This is a small letter");
    
    }
   else if (ch>='A'&&ch<='Z'){
   
       System.out.println("This is a capital letter");
   
   }
   else{
   
    System.out.println("This is not a letter9"
            );
   
   }
    
    
    
    }
}
  