
import java.util.Scanner;

    

public class student_management {
    
    private String name;
    private int age;
    private String course;
    private String year;
    private String section;
    
    public student_management(String name, int age, String course, String year, String section){
    
         this.name=name;
         this.age=age;
         
         this.course=course;
         
         this.year=year;
         
         this.section=section;
         
    }
        
         
         public int getAge(){
         
         return age;
         }
         
         
         public String getCourse(){
         
         return course;
         }
    
    
        public String getYear(){
            
            return year;
            
        }
        public String getSection(){
            
         return section;   
            
        }
        public String getName(){
        
        return name;
        }
    
    
    }

   
public static void main(Sting args[]){

int x=0;
int menuChoice=-1;


student_management[] student = new student_management[50];

Scanner input = new Scanner (System.in);

System.out.println("\t\t\t Student report menu");
System.out.println("\t\t1.Add student \t2.view students\t3")




}