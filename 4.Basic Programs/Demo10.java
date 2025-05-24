//! Write a program to find the factorial of a given number?
public class Demo10 {
    public static void main(String[] args) {
        // find_fact(5);
        System.out.println(find_fact(5));
    }

    // ! Iterative Approach
    /* public static void find_fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    } */

    // ! Recursive Approach
    /* public static int find_fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * find_fact(n - 1);
        }
    } */

    //! using Repeated Addition
    //? Calculate factorial using repeated addition
    public static int find_fact(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = multiply(result, i);
        }
        return result;
    }
    //? Multiply a and b using repeated addition
    public static int multiply(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }




}
