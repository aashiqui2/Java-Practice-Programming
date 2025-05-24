//! Write a program to find the largest element in an array?
import java.util.*;

public class Demo1 {
  public static void main(String args[]) {
    int arr1[] = { 2, 5, 1, 3, 0 };

    System.out.println("The Largest element in the array is: " + sort(arr1));
    int arr2[] = { 8, 10, 5, 7, 9 };
    System.out.println("The Largest element in the array is: " + sort(arr2));

    System.out.println("The Largest element in the array is: " + findLargestElement(arr1));
  }

  //! Using Sorting
  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
  //! Time Complexity: O(N*log(N))

  //! Using a max variable
  static int findLargestElement(int arr[]) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  //! Time Complexity: O(N)
}
