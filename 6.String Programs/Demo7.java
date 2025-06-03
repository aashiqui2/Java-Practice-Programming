//! Write a program to check if the string is rotated of other?
public class Demo7 {
    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        System.out.println(rotateString(s, goal));

    }
    //! Brute force approach
    /* public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        int n = s.length();
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    } */
    //! Time Complexity:O(n^2)

    //! Optimal approach
    public static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
    //!Time Complexity:O(n)
}
