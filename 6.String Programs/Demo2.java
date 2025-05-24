//! Write a program to reverse the words in a string?
import java.util.Stack;

public class Demo2 {

    public static void main(String[] args) {
        String s = " the sky is blue ";
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println(reverseWords(s1)); // blue is sky the
        System.out.println(reverseWords(s2)); // world hello
        System.out.println(reverseWords(s3)); // example good a
    }

    // !Brute Force Approach
    public static String reverseWords(String s) {
        // ! Trim and split by one or more spaces using regex
        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i!=0)
            {
                sb.append(" ");
            }
        }  
        return sb.toString();
    }
}
//! LC(151)->https://leetcode.com/problems/reverse-words-in-a-string/description/