//! Write a program to find the common divisor of the given numbers?
public class Demo5 {
    public static void main(String[] args) {
        find_common_divisor(4,12);
    }
     public static void find_common_divisor(int no1, int no2) {
        int div = 1;
        int small = (no1 < no2) ? no1 : no2;
        while (div <= small ) {
            if (no1 % div == 0 && no2 % div == 0) {
                System.out.print(div + " ");
            }
            div++;
        }
    }
}
