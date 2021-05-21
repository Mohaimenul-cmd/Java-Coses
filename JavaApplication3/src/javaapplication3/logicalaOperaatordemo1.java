
package javaapplication3;

import java.util.Scanner;

public class logicalaOperaatordemo1 {
    
    public static void main(String[] args){
        
      Scanner demo = new Scanner(System.in);
      
      char ch;
      System.out.println("Enter any letter:");
      
      ch=demo.next().charAt(0);
    
      
      if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                 System.out.println("It is vowel");
      }
      
      else if (ch=='A'|| ch=='E'|| ch=='O'|| ch=='U'|| ch=='I'){
      
                 System.out.println("It is vawel too");
      
      }
      else{
      
                 System.out.println("It is not a vowel and it is consonent");
      
      }
    }
    
    
}
