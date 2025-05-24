//! Write a program to rotate the array to Left by k places?
public class Demo6 {
    // ! Brute Force approach
    /* public static void rotateToLeft(int[] arr, int n, int k) {
        if (n == 0 || k % n == 0) {
            return;
        }
        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    } */
    // ! Time Complexity: O(n+k)

    // ! Optimal Approach
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateToLeft(int[] arr, int n, int k) {
        // Reverse first k elements
        Reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        Reverse(arr, k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;

        rotateToLeft(arr, n, k);

        System.out.println("After Rotating the elements to left:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
