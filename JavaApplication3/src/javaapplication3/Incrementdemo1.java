
package javaapplication3;

/**
 *
 * @author mahad
 */
public class Incrementdemo1 {
    public static void main(String[] args){
    
     int x=25;
     int y;
     
    y=x++; //part increment
    System.out.println("y="+y);
     y=x;
     System.out.println("y="+y);
    y=x++;
    System.out.println("y="+y);
    y=x;
    System.out.println("y="+y);
    }
    
}
