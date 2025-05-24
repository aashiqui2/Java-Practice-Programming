//! Write a program to print the Count of divisors? 
public class Demo3 {
    public static void main(String[] args) {
        count_of_divisor(120);
    }

    public static void count_of_divisor(int no) {
        int div = 2;
        int count = 0;
        while (div <= (no / 2)) {
            if (no % div == 0) {
                count++;
            }
            div++;
        }
        System.out.println(count);
    }
}
