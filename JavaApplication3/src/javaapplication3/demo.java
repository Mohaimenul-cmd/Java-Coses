
package javaapplication3;
import java.util.Scanner;
public class demo {
    public static void main(String[] args){
    
    Scanner input=new Scanner(System.in);
    
    String name;
    
    System.out.println("Enter your name:");
    name=input.nextLine();
    System.out.println("Welcome Mr."+name);
    
    double nub1, nub2, result;
    
    System.out.println("Enter first number: ");
    nub1=input.nextDouble();
    
     System.out.println("Enter Second number: ");
     nub2=input.nextDouble();
     
     result=nub1+nub2;
     System.out.println("Sum: "+result);
     System.out.println("Your sum is : "+result);
     
     result=nub1-nub2;
     System.out.println("Subtraction is :"+result);
     
     result=(double)nub1/nub2;
     System.out.println("Enter devide is: "+result);
     
    }
    
}
