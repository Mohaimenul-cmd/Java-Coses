/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author mahad
 */
public class Problem3 {
 


 

    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  int [] Sid= new int[10];
   float[] cgpa= new float[10];
   int []credit= new int[10];
   for(int i=0;i<10;i++){
       System.out.print("Enter "+(i+1)+" no students id:");
       Sid[i]=input.nextInt();
        System.out.print("Enter  "+(i+1)+" no students cgpa:");
        cgpa[i]=input.nextFloat();
        System.out.print("Enter  "+(i+1)+" no of students completed credit:");
        credit[i]=input.nextInt();
    }
    System.out.println("Student's ID whose CGPA is more then 3.75");
    for(int i=0; i<10;i++){
    if(cgpa[i]>3.75)
       System.out.print(Sid[i]+" "); }
    System.out.print("\n ");
     System.out.println("Student's ID whose has completed 50 Credits");
       for(int i=0; i<10;i++){
    if(credit[i]>=50)
       System.out.print(Sid[i]+"\n"); } 
    }
}

