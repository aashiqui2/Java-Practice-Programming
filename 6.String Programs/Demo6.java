//! write a program to find the isomorphic string?

import java.util.HashMap;
import java.util.HashSet;

public class Demo6 {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        // String s1 = "ab", t1 = "cc";
        // String s2 = "foo", t2 = "bar";
        if (isIsomorphic(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /* public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int hash[] = new int[256];
        boolean[] isMapped = new boolean[256];
        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (hash[sc] == 0) {
                if (isMapped[tc]) {
                    return false;
                }
                hash[sc] = tc;
                isMapped[tc] = true;
            } else {
                if (hash[sc] != tc)
                    return false;
            }
        }
        return true;
    } */

    // ! Optimal solution
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            else {
                if (set.contains(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }

}
// ! LC()->https://leetcode.com/problems/isomorphic-strings/description/