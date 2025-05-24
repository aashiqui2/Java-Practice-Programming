//! Write a program to find the given string is palindrome  or not?
public class Demo16 {
    public static void main(String[] args) {
        String str = " ABCDCBA ";
        boolean ans = isPalindrome(str);
        if (ans == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        String s = "madam";
        System.out.println(palindrome(0,s));
    }
    //! BruteForce Approach
    /* static private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    } */
    //! Time Complexity:  O(N)

    //! Recursive Approach:
    static boolean palindrome(int i, String s){
           
            if(i>=s.length()/2) return true;
          
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            
            return palindrome(i+1,s);
    }
    //! Time Complexity: O(N) { Precisely, O(N/2)

}
