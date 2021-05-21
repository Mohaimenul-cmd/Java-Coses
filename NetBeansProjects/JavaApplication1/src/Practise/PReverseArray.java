/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;

/**
 *
 * @author mahad
 */
public class PReverseArray {
    public static void main(String[] args){
    
        int []arr = new int[] {8,2,6,0,1};
        System.out.print("Original array is:");
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
        }
       System.out.println();
    
        System.out.print("Reverse array:");
        for(int i=arr.length-1; i>=0; i--){
        System.out.print(arr[i]+" ");
        }
    }
    
}
