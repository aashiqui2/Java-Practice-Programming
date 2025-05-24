//! Write a program to find the common divisible of 3 and 5 upto 100?
public class Demo4 {
    public static void main(String[] args) {
        divisible_of_3_and_5();
    }
    public static void divisible_of_3_and_5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i);
        }
    }
}
