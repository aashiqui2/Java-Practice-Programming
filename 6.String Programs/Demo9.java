import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo9 {
    public static String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entries) {
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }
}
