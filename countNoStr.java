public class countNoStr {
    public static void main(String[] args) {
        String text = "abxabcabcaby";
        String substring = "abc";
        int count = countSubstring(text, substring);
        System.out.println(count);
    }

    public static int countSubstring(String text, String subStr) {
        int count = 0;
        int index = 0;
        int subString = subStr.length();

        while(index != -1) {
            index = text.indexOf(subStr, index);
            if(index != -1) {
                count++;
                index += subString;
            }
        }

        return count;
    }
}
