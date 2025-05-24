//! Write a program to Remove outmost Paranthesis?
public class Demo1 {
    public static void main(String[] args) {
        String s="(()())(())";
        String res=removeOuterParentheses(s);
        System.out.println(res);
        
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                cnt--;
            }
            if(cnt!=0)
            {
                sb.append(s.charAt(i));
            }
             if(s.charAt(i)=='(')
            {
                cnt++;
            }
        }
        return sb.toString();   
    }
}
//! LC (1021)->https://leetcode.com/problems/remove-outermost-parentheses/description/
