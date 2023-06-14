public class reverseStr {
    public static void main(String[] args) {
        String str = "I am happy";
        String result = findReverseString(str);
        System.out.println(result);
    }

    public static String findReverseString(String s) {
        StringBuilder sb = new StringBuilder();
        String[] string = s.split(" ");
        int left = 0;
        int right = string.length - 1;
        while(left < right) {
            String temp = string[left];
            string[left] = string[right];
            string[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i < string.length; i++) {
            sb.append(string[i]);
            if(i >= 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
