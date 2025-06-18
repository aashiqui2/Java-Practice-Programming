//! Write a program to Sort Characters By Frequency?
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo9 {

    //! brute force approach
   /*  public static String frequencySort(String s) {
        int[] freq = new int[128]; 

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        for (int count = 0; count < s.length(); ) {
            int maxFreq = 0;
            char maxChar = 0;

            for (int i = 0; i < 128; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char) i;
                }
            }

            for (int i = 0; i < maxFreq; i++) {
                result.append(maxChar);
            }

            count += maxFreq;
            freq[maxChar] = 0;
        }

        return result.toString();
    } */
    //! time complexity:O(n*128)
    
    public static String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a list of characters sorted by frequency (descending)
        List<Character> chars = new ArrayList<>(freqMap.keySet());
        chars.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int freq = freqMap.get(c);
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));     // eert or eetr
        System.out.println(frequencySort("cccaaa"));   // aaaccc or cccaaa
        System.out.println(frequencySort("Aabb"));     // bbAa or bbaA
    }
}
