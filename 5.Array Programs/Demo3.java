//! Write a program to check the given array is sorted?
public class Demo3 {
    //!Brute Force Approach 
    static boolean isSorted(int arr[], int n) {
        /* for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true; */
        //! Time Complexity: O(N^2)
        //! Optimal Approach
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
        //! Time Complexity: O(N)
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 }, n = 5;
        System.out.println(isSorted(arr, n));
    }
}

