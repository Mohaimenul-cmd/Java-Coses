package com.company;
import java.util.Arrays;
import java.util.Collections;
public class Kth {
   public static int kthsmallest(int[] arr, int k){

      Arrays.sort(arr);
      return arr[k-1];

   }

   public static void main(String[] args)
   {

      int arr[]=new int[] {12,3,5,6,12};
      int k=2;
      System.out.print("kth smallest element is"+kthsmallest(arr,k) );


   }

}
