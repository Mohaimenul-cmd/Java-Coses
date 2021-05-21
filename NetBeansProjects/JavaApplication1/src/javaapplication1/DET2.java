/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

    

 import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class problem3
{
    public static boolean isUnique(int[] arr){
        Set<Integer> foundNumbers = new HashSet<Integer>();
        for (int num : arr) {
            if(foundNumbers.contains(num)){
                return false;
            }
            foundNumbers.add(num);
        }
        return true;
    }
    static int removeDuplicates(int[] arr, int n)
    {
        if(isUnique(arr)){
            return 0;
        }
        if (n == 0 || n == 1)
            return n;


        int j = 0;

        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];

        return j;
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size1;

        System.out.println("Enter  array size: ");
        size1 = scanner.nextInt();
        int[] array = new int[size1];
        System.out.println("Enter  array elements: ");
        for (int i = 0; i < size1 ; i++) {
            array[i] = scanner.nextInt();
        }

        int n = array.length;

        n = removeDuplicates(array, n);


if (n!=0){
    for (int i=0; i<n; i++) {
        System.out.print(array[i] + " ");
    }
}else {
    System.out.println("Array already unique!");
}
    }
}

   

   

