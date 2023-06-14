public class stringAllowed {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int result = countTheAllowedString(words, allowed);
        System.out.println(result);
    }

    public static int countTheAllowedString(String[] words, String allowed) {
        int count = 0;
        boolean[] allowedChars = new boolean[26];
        
        for(char ch: allowed.toCharArray()) {
            allowedChars[ch - 'a'] = true;
        }

        for(String word: words) {
            boolean consistent = true;
            for(char ch: word.toCharArray()) {
                if(!allowedChars[ch - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if(consistent) {
                count++;
            }
        }

        return count;
    }
}
