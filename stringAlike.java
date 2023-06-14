public class stringAlike {
    public static void main(String[] args) {
        String str = "book";
        boolean result = findStringAlike(str);
        System.out.println(result);
    }

    public static boolean findStringAlike(String str) {
        int n = str.length();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n / 2; i++) {
            if(isVowel(str.charAt(i))) {
                count1++;
            }
        }

        for(int i = n / 2; i < n; i++) {
            if(isVowel(str.charAt(i))) {
                count2++;
            }
        }

        return count1 == count2;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
    }
}
