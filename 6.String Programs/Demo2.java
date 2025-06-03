//! Write a program to reverse the words in a string?
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
   /*  public static String reverseWords(String s) {
        // ! Trim and split by one or more spaces using regex
        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    } */

    //! Time Complexity: O(n),space complexity:O(n)

    //! Optimal Approach
    public static String reverseWords(String s) {
        int end = s.length() - 1;
        StringBuilder result = new StringBuilder();

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') 
            {
                end--;
            }
            if (end < 0) break;

            int start = end;
            // Find start of word
            while (start >= 0 && s.charAt(start) != ' ')
            {
                start--;
            } 

            // Append word
            result.append(s.substring(start + 1, end + 1)).append(" ");

            end = start - 1;
        }

        // Remove final extra space
        return result.toString().trim();
    }
    //! Time Complexity: O(n)

}