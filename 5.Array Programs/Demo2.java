
//! Write a program to find the second Largest Element in an array
import java.util.Arrays;
import java.io.*;
import java.sql.Time;

public class Demo2 {
    static private int getElements(int[] arr, int n) {
        // ! Brute Force Approach [this approach only works if there are no duplicates]
        /* if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        } else {
            Arrays.sort(arr);
            int small = arr[1];
            int large = arr[n - 2];
            System.out.println("Second smallest is " + small);
            System.out.println("Second largest is " + large);
        } */
        // ! Time Complexity: O(NlogN)

        /* if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        else{
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        
        System.out.println("Second smallest is " + second_small);
        System.out.println("Second largest is " + second_large);
    } */
    //! Time Complexity: O(N)

    if(n<2)
    {
        return -1;
    }
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;
     //! Time Complexity: O(N)
}

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 5};
        int n = arr.length;
        int result=getElements(arr, n);
        System.out.println(result);
    }
}
