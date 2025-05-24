//! Write a program to Reverse an array 

import java.util.Arrays;
import java.util.Collections;

public class Demo15 {

    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void printArray(Integer arr[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }

    // ! Using an extra array.
    /* static void reverseArray(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    } */

    // ! Space-optimized iterative method
   /*  static void reverseArray(int arr[], int n) {
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        printArray(arr, n);
    } */

    // ! Recursive approach
    /* static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    } */

    //! Using Inbuilt Methods
    static void reverseArray(Integer arr[]) {
       Collections.reverse(Arrays.asList(arr));
   }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1 };
        // reverseArray(arr, n);
        // reverseArray(arr, 0, n - 1);
        // printArray(arr, n);
        
        Integer a[]={5,4,3,2,1};
        reverseArray(a);
        printArray(a, n);
    }
}
