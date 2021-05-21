/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import java.util.Scanner;


public class Ifelsestatement {
      public static void main(String[] args){
      
      Scanner demo = new Scanner(System.in);
      
      char ch;
      System.out.println("Enter a letter : ");
      
      ch = demo.next().charAt(0);
      
      if(ch=='a'){
      
          System.out.println("Letter is Vowel");
      
                 }
      else if(ch=='e'){
      
           System.out.println("Letter is Vowel");
                      }
      else if(ch=='i'){
      
            System.out.println("Letter is Vowel");
                       }
      else if(ch=='o'){
      
            System.out.println("Letter is Vowel");           
                       }
      else if(ch=='u'){
      
            System.out.println("Letter is Vowel");
      
                      }
      else{
      
       System.out.println("Letter is Consonent");
          
          }
     
      }
      
      
      }    

