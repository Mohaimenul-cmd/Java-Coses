/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class FindDate{  
public static void main(String[] args) {  
    Date d=new Date();
    SimpleDateFormat S =new SimpleDateFormat("dd/MM/yyyy");
    
    String stringDate= S.format(d);
    System.out.println(stringDate);
   
}  
}  
