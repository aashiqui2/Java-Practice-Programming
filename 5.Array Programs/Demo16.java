import java.util.HashMap;
import java.util.Map;

public class Demo16 {
    // ! Brute Force Approach
    // public static int getLongestSubarray(int a[], long q) {
    // int n = a.length;
    // // ! To print all the sub array
    // // for (int i = 0; i < n; i++) {
    // // for (int j = i; j < n; j++) {
    // // for (int k = i; k <= j; k++) {
    // // System.out.print(a[k]);
    // // }
    // // System.out.print(" ");
    // // }
    // // System.out.println();
    // // }
    // int len = 0;
    // for (int i = 0; i < n; i++) {
    // for (int j = i; j < n; j++) {
    // long s = 0;
    // for (int K = i; K <= j; K++) {
    // s += a[K];
    // }
    // if (s == q) {
    // len = Math.max(len, j - i + 1);
    // }
    // }
    // }
    // return len;
    // }

    // ! Time Complexity: O(N3)

    // ! Approach 2: two loops
    // public static int getLongestSubarray(int[] a, long k) {
    // int n = a.length;
    // int len = 0;
    // for (int i = 0; i < n; i++) {
    // long s = 0;
    // for (int j = i; j < n; j++) {
    // s += a[j];
    // if (s == k){
    // len = Math.max(len, j - i + 1);
    // }
    // }
    // }
    // return len;
    // }
    // ! Time Complexity: O(N2)

    // ! Approach 3: Hashing
    // public static int getLongestSubarray(int[] a, long k) {
    // Map<Long, Integer> prefixMap = new HashMap<>();
    // long sum = 0;
    // int maxLen = 0;
    // for (int i = 0; i < a.length; i++) {
    // sum += a[i];
    // if (sum == k) {
    // maxLen = i + 1;
    // }

    // if (prefixMap.containsKey(sum - k)) {
    // maxLen = Math.max(maxLen, i - prefixMap.get(sum - k));
    // }
    // if (!prefixMap.containsKey(sum)) {
    // prefixMap.put(sum, i);
    // }
    // }
    // return maxLen;
    // }

    // ! Time Complexity:Time Complexity: O(N) or O(N*logN)

    // ! Approach 3- Two Pointers- (not work for negative case)
    public static int getLongestSubarray(int[] a, long k) {
        int n = a.length;
        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += a[right];
            }
        }
        return maxLen;
    }
    // ! Time Complexity:Time Complexity: O(2*N)

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 1, 9 };
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
