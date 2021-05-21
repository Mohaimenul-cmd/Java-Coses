/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**Factorial-5!=5*4*3*2*1
 *
 * @author mahad
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a,result=1;
        System.out.print("Enter your number: ");
        a=sc.nextInt();
        
        for (int i=a; i>=1;i--){
        
        System.out.println(i+" ");
        
        result=result*i;
        }
        System.out.println("The result is : "+result);
    }
    
}
