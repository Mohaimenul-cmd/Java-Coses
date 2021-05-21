/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        
    String[] strArray = {"cpu","psu","mobo","ram"};///////////////////////////////////////////////////////
    
    System.out.println(Array.toString(strArray)+"\n\n");
    int x=0;
    int menuChoice=-1;
    Scanner input= new Scanner(System.in);
    Student[] students = new Student[50];
   
    
      System.out.println("\t\t\t\t\t\t University Management System ");
      System.out.println("\t\t1.Student Management \t2.Teacher Management\t3.Book Management \t4.Basic Management\t5.Exit");
      System.out.println("\n\nEnter a choice: ");
       
      String[] strStart = {"cpu","psu","mobo","ram"};////////////////////////////////////////////////////////
      
      menuChoice=input.nextInt();
      
       switch( menuChoice){
                case 1:
                    
                    System.out.println("\t\t\t Student report menu");
                    System.out.println("\t\t1.Insert student \t2.Show students\t3.Search Student \t4.Exit");
                    System.out.println("Enter a choice: ");
                    
                    menuChoice=input.nextInt();
        
                    if(menuChoice==1){

  if(x<50){
      
     
      
           
      System.out.println("Name: ");    
      String name= input.next();
      
      System.out.println("Id:");
      int id=input.nextInt();
      
      System.out.println("Department Name: ");
      String departmentName=input.next();
      
      
      System.out.println("Email: ");
      String email=input.next();
      
      
      System.out.println("Moblie No: ");
      int contactNo=input.nextInt();
      
       System.out.println("Address : ");
     String address=input.next();

       System.out.println("Amount : ");
      double amount=input.nextInt();
      
       System.out.println("Guardian Name: ");
      String guardianName=input.next();
      
     /*System.out.println("Guardian ContactNo: ");
      int guardianContactNo=input.nextInt();*/
      
      Student s = new Student(id,name,departmentName,email,contactNo,address,amount,guardianName,guardianContactN0);
      
      
     students[x] = s;

      x++;
      
  }
  else {
  
   System.out.println("Can not able to add student, students full");
  
  }


   
}
else if (menuChoice==2){
    
     

    
   
for (int i=0; i<x; i++){

  Student s = students[i];
  
  

  
  System.out.println("s.getId()+s.getName()+s.getdepartName()+s.getEmail()+s.getContactNo()+s.getAddress+s.getAmount+s.getGuardianName()+s.getGuardianContactNo");
  

}



}
else if (menuChoice<1 ||menuChoice>4){

    System.out.println("unrecognised menuChoice, please re enter");

}
while (menuChoice!=4);

input.close();


    break;
    
                case 2:
                    
                     System.out.println("\t\t\t Student report menu");
                    System.out.println("\t\t1.Insert student \t2.Show students\t3.Search Student \t4.Exit");
                    System.out.println("Enter a choice: ");
                    
                    menuChoice=input.nextInt();
        
                    if(menuChoice==1){

  if(x<50){
           
      System.out.println("Name: ");    
      String name= input.next();
      
      System.out.println("Id:");
      int id=input.nextInt();
      
      System.out.println("Department Name: ");
      String departmentName=input.next();
      
      
      System.out.println("Email: ");
      String email=input.next();
      
      
      System.out.println("Moblie No: ");
      int contactNo=input.nextInt();
      
       System.out.println("Address : ");
     String address=input.next();

       System.out.println("Amount : ");
      double amount=input.nextInt();
      
       System.out.println("Guardian Name: ");
      String guardianName=input.next();
      
     /*System.out.println("Guardian ContactNo: ");
      int guardianContactNo=input.nextInt();*/
      
      Student s = new Student(id,name,departmentName,email,contactNo,address,amount,guardianName,guardianContactN0);
      
      
     students[x] = s;

      x++;
      
  }
  else {
  
   System.out.println("Can not able to add student, students full");
  
  }


  
}
else if (menuChoice==2){

for (int i=0; i<x; i++){

  Student s = students[i];
  
  System.out.println("s.getId()+s.getName()+s.getdepartName()+s.getEmail()+s.getContactNo()+s.getAddress+s.getAmount+s.getGuardianName()+s.getGuardianContactNo");
  

}



}
else if (menuChoice<1 ||menuChoice>4){

    System.out.println("unrecognised menuChoice, please re enter");

}
while (menuChoice!=4);

input.close();


    break;
                    
                    
                    
}

            
            
            
      
      
            
            
            
            
            
       }
    
    
    
    
      
      
    
    }
  