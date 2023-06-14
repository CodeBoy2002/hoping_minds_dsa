public class reverseLetterStr {
    public static void main(String[] args) {
        String str = "love you";
        String result = findTheReverseOfLetter(str);
        System.out.println(result);
    }

    public static String findTheReverseOfLetter(String s) {
        StringBuilder sb = new StringBuilder();
        String[] newStr = s.split(" ");
        for(int i = 0; i < newStr.length; i++) {
            String reversed = reversingTheLetter(newStr[i]);
            sb.append(reversed);
            if(i >= 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static String reversingTheLetter(String sub) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = sub.length() - 1;
        char[] ch = sub.toCharArray();
        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        for(char c: ch) {
            sb.append(c);
        }

        return sb.toString();
    }
}
