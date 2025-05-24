//! Write a program to find the frequency of each elements?
import java.util.*;

public class Demo17 {

    public static void main(String args[]) {

        int arr[] = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        countFreq(arr, n);
    }

    /* public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
            {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    } */

    // ! Dynamic Programming using Dp array
    static void countFreq(int arr[]) {

        // Step 1: Find the maximum element to size the DP array
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        // Step 2: Create the DP array (frequency array)
        int[] dp = new int[max + 1];

        // Step 3: Count frequencies
        for (int num : arr) {
            dp[num]++;
        }

        // Step 4: Print frequencies
        System.out.println("Frequency of elements:");
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > 0) {
                System.out.println(i + " -> " + dp[i]);
            }
        }
    }

    // ! Optimal Approach using hashMap
    /* static void countFreq(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    } */
}
// ! Time Complexity: O(N*N)