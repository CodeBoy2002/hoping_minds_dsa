import java.util.*;

public class maxRepeating {
    public static void main(String[] args) {
        String str = "ababa";
        String word = "ab";
        int result = findMaxRepeating(str, word);
        System.out.println(result);
    }

    public static int findMaxRepeating(String s, String word) {
        int maxRepeating = 0;
        int n = s.length();
        int m = word.length();

        if(n < m) {
            return 0;
        }

        Map<String, Integer> substring = new HashMap<>();
        for(int i = 0; i <= n - m; i++) {
            String cur = s.substring(i, i+m);
            int count = substring.getOrDefault(cur, 0) + 1;
            substring.put(cur, count);
            maxRepeating = Math.max(maxRepeating, count);

        } 

        return maxRepeating;
    }
}
