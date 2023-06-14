public class consistantStr {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int count = findConsistantString(allowed, words);
        System.out.println(count);
    }

    public static int findConsistantString(String allowed, String[] words) {
        int count = 0;

        for(int i = 0; i < words.length; i++) {
            if(words[i].contains(allowed)) {
                count++;
            }
        }

        return count;
    }
}
