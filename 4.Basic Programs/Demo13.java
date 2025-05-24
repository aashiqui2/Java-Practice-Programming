//! Write a program to find the square root of a given Number?
public class Demo13 {
    public static void main(String[] args) {
        find_Square_Root(16);
    }

    // ! Brute Force Approach
    // public static void find_Square_Root(int no) {
    // int div = 2;
    // while (div <= (no / 2)) {
    // if (no / div == div) {
    // System.out.println("Square root is " + div);
    // break;
    // }
    // div++;
    // }
    // }
    //! Time Complexity: O(n)

    // ! Optimal Approach
    public static void find_Square_Root(int no) {
        if (no < 0) {
            System.out.println("Invalid input");
            return;
        }
        if (no == 0 || no == 1) {
            System.out.println(no);
            return;
        }
        int start = 1, end = no, result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= no / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
    //! Time Complexity O(log n)
}
