public class incDescString {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        String result = findIncDescString(str);
        System.out.println(result);
    }
    
    public static String findIncDescString(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int[] count = new int[26];

        for(char ch: s.toCharArray()) {
            count[ch - 'a']++;
        }

        while(result.length() < n) {
            //THIS IS FOR APPENDING SMALLEST TO CHARACTERS
            for(int i = 0; i < 26; i++) {
                if(count[i] > 0) {
                    result.append((char)('a' + i));
                    count[i]--;
                }
            }

            //THIS IS FOR APPENDING LARGEST CHARACTERS
            for(int i = 25; i >= 0; i--) {
                if(count[i] > 0) {
                    result.append((char)('a' + i));
                    count[i]--;
                }
            }
        }

        return result.toString();
    }
}
