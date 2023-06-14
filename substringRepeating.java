public class substringRepeating {
    public static void main(String[] args) {
        String str = "abxabcabcaby";
        String pattern = "abcaby";
        int result = findThePattern(str, pattern);
        System.out.println(result);
    }

    public static int findThePattern(String s, String pattern) {
        int count = 0;
        int subLength = pattern.length();
        int index = 0;
        while(index <= s.length() - subLength) {
            if(s.substring(index, index + subLength).equals(pattern)) {
                count++;
            }
            index++;
        }

        return count;
    } 
}
