//! Write a program to find the LCM and GCD of the given numbers?
public class Demo6 {
    public static void main(String[] args) {
        LCM(12, 18);
        System.out.println(GCD(11, 22));
    }

    public static void LCM(int no1, int no2) {
        /* int max = no1 > no2 ? no1 : no2;
        while (true) {
            if (max % no1 == 0 && max % no2 == 0) {
                System.out.println("LCM IS " + max);
                break;
            }
            max = max + 1;
        } */
        System.out.println((no1 * no2) / GCD(no1, no2));
    }

    public static int GCD(int a, int b) {
        /* int last = 0;
        int div = 2;
        int small = a < b ? a : b;
        while (div <= small) {
            if (a % div == 0 && b % div == 0) {
                last = div;
            }
            div++;
        }
        return last; */

        // ! Eculidean Algorithm
       /*  while (b != 0) {
            int temp = a;
            b = a % b;
            a = temp;
        }
        return a; */

        //! Modified Euclidean Algorithm
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}

// ? LCM =A*B/GCD(A,B);