public class oddCountString {
    public static void main(String[] args) {
        int n = 4;
        String result = generateOddCountString(n);
        System.out.println(result);
    }

    public static String generateOddCountString(int n) {
        StringBuilder result = new StringBuilder();
        if(n % 2 == 0) {
            result.append('a');
            n--;
        }
        for(int i = 0; i < n; i++) {
            result.append('b');
        }

        return result.toString();
    }
}
