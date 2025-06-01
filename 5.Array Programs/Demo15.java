import java.util.HashMap;
import java.util.Map;

public class Demo15 {
    // ! Brute force approach
    // public static int getSingleElement(int []arr) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // int num = arr[i];
    // int cnt = 0;

    // for (int j = 0; j < n; j++) {
    // if (arr[j] == num)
    // cnt++;
    // }
    // if (cnt == 1) return num;
    // }
    // return -1;
    // }
    // ! Time complexity: O(N2)

    // ! Approach 1: Hashing
    // public static int getSingleElement(int []arr) {
    // int n = arr.length;
    // int maxi = arr[0];
    // for (int i = 0; i < n; i++) {
    // maxi = Math.max(maxi, arr[i]);
    // }

    // int[] hash = new int[maxi + 1];
    // for (int i = 0; i < n; i++) {
    // hash[arr[i]]++;
    // }
    // for (int i = 0; i < n; i++) {
    // if (hash[arr[i]] == 1)
    // return arr[i];
    // }
    // return -1;
    // }
    // ! Time Complexity:O(N)+O(N)+O(N)

    // ! Approach 2: using hash map collection
    // public static int getSingleElement(int []arr) {
    // int n = arr.length;
    // HashMap<Integer, Integer> mpp = new HashMap<>();
    // for (int i = 0; i < n; i++) {
    // int value = mpp.getOrDefault(arr[i], 0);
    // mpp.put(arr[i], value + 1);
    // }
    // for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
    // if (it.getValue() == 1) {
    // return it.getKey();
    // }
    // }
    // return -1;
    // }
    // ! Time Complexity: O(N*logM) + O(M),

    //! Approach 3:Using XOR
    public static int getSingleElement(int []arr) {
        int n = arr.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
    //! Time Complexity: O(N) 

    public static void main(String args[]) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
