
package Student_management;

import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        
      
      

int x=0;
int menuChoice=0;


Student[] student = new Student[50];

Scanner input = new Scanner (System.in);

System.out.println("\t\t\t Student report menu");
System.out.println("\t\t1.Add student \t2.view students\t3.Search Student \t4.Exit");
System.out.println("Enter a choice: ");

menuChoice=input.nextInt();

if(menuChoice==1){

  if(x<50){
           
      System.out.println("Full Name: ");    
      String name= input.next();
      
      System.out.println("Age:");
      int age=input.nextInt();
      
      System.out.println("Course: ");
      String course=input.next();
      
      
      System.out.println("Year: ");
      int year=input.nextInt();
      
      
      System.out.println("Section: ");
      String section=input.next();
    
      
      Student s = new Student(name,age, course, year, section);
      
      
     student[x] = s;

      x++;
      
  }
  else {
  
   System.out.println("Can not able to add student, students full");
  
  }


  
}
else if (menuChoice==2){

for (int i=0; i<x; i++){

  Student s = student[i];
  
  System.out.println("s.getName()+s.getAge()+s.getCourse()+s.getYear()+s.getSection()");
  

}



}
else if (menuChoice<1 ||menuChoice>4){

    System.out.println("unrecognised menuChoice, please re enter");

}
while (menuChoice!=4);

input.close();
}



    
}
        
    
    

