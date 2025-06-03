//! Write a program to find the longestcommonprefix in a given string?
import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        String[] s = {"cluster","clue","clutch","club","clumsy"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        if (s.length < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        char s1[] = s[0].toCharArray();
        char s2[] = s[s.length - 1].toCharArray();

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                break;
            } else {
                sb.append(s1[i]);
            }
        }
        return sb.toString();
    }
}
