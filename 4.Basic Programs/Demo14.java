//! Write a program to find the power of a given Numbers?
public class Demo14 {
    public static void main(String[] args) {
        double base = 2;
        int power = -2;
        find_pow(base, power);
    }

    public static void find_pow(double base, int power) {
        double box = 1;
        if (power < 0) {
            base = 1 / base;
            power = -(power);
        }
        // ! Brute Force approach

        /* while (power > 0) {
            box = box * base;
            power--;
        } */

        // ! bit expoentiaton
       /*  while (power > 0) {
            if (power % 2 == 1) {
                box = box * base;
            }
            base = base * base;
            power >>= 1;
        } */
        System.out.println(box);
    }
}
