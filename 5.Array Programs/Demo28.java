import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo28 {
    //!Brute Force Approach
    public static boolean linearSearch(int[] a, int num) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }

    /* public static int longestConsecutive(int[] a) {
        int n = a.length; 
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;
            while (linearSearch(a, x + 1) == true) {
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    } */
    //? Time Complexity: O(N2)

    //! Better Approach
     /* public static int longestConsecutive(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    } */
    //? Time Complexity: O(NlogN) + O(N)

    //! Optimal Approach:
    public static int longestConsecutive(int[] nums) {

       HashSet<Integer> set = new HashSet<>();

       for(int num: nums){
            set.add(num);
       }

       int count = 0;
       int max = 0;

       for(int num : set){
            if(!set.contains(num-1)){
                count = 0;
                while(set.contains(num)){
                    count++;
                    num++;
                }
                max = Math.max(max, count);
            }
       }

       return max;
    }
    //? Time Complexity: O(3*N)

    public static void main(String[] args) {
        int[] a = { 100, 200, 1, 2, 3, 4 };
        int ans = longestConsecutive(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
