//! Write a program to check the given string are anagram or not?
import java.util.Arrays;

public class Demo8 {
    public static String SortString(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    // ! Brute Force approach
    /* public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = SortString(str1);
        str2 = SortString(str2);
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    } */
    //!  Time Complexity: O(nlogn)

    //!  Optimal approach
    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'A']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
    //! Time Complexity: O(n)

    public static void main(String args[]) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagrams(Str1, Str2));
    }
}
