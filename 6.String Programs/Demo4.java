//! Write a program to find the largest Odd number in a string?
public class Demo4 {
    //! Brute Force Approach
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "4206";
        System.out.println("Largest odd-numbered substring: " + largestOddNumber(num));

        num = "35427";
        System.out.println("Largest odd-numbered substring: " + largestOddNumber(num));

        num = "52";
        System.out.println("Largest odd-numbered substring: " + largestOddNumber(num));
    }
}
//! LC(1903)->https://leetcode.com/problems/largest-odd-number-in-string/description/
