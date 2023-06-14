import java.util.*;

public class isSubstring {
    public static void main(String[] args) {
        String[] words = {"leetcode","et","code"};
        List<String> result = new ArrayList<>();
        result = stringMatching(words);
        System.out.println(result);
        
    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i < n; i++) {
            String currentWord = words[i];
            for(int j = 0; j < n; j++) {
                while(i != j && words[j].contains(currentWord)) {
                    result.add(currentWord);
                    break;
                }
            }
        }
        return result;
    }
       
}