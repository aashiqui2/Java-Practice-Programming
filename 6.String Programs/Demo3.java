//! Write a program to print all the substring of a given string?
public class Demo3 {

    //! Iterative Approach
    public static void printAllSubstrings(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "35427";
        System.out.println("All substrings of \"" + str + "\":");
        printAllSubstrings(str);
    }
}