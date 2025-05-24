//! Write a program to find the highest and lowest frequency of element in an array?

import java.util.HashMap;
import java.util.Map;

public class Demo18 {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        countFreq(arr, n);
    }

    // ! Brute-Force approach
    /* public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    } */
//! Time Complexity: O(N*N)

//! Using Dynamaic Programming
  static void countFreq(int arr[])
  {
    int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        int[] dp = new int[max + 1];
        for (int num : arr) {
            dp[num]++;
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > 0) {
                if (dp[i] < minFreq) minFreq = dp[i];
                if (dp[i] > maxFreq) maxFreq = dp[i];
            }
        }
        System.out.println("Minimum frequency: " + minFreq);
        System.out.println("Maximum frequency: " + maxFreq);
    }
  

//! Using HashMap
   /*  static void countFreq(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    } */
//! Time Complexity: O(N)
}
