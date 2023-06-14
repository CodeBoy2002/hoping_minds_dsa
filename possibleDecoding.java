public class possibleDecoding {
    public static int newDecoding(String s) {
        if(s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i-1, i));
            int twoDigit = Integer.parseInt(s.substring(i-2, i));

            if(oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i-1];
            }
            if(twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        String str = "123";
        int result = newDecoding(str);
        System.out.println("Possible no.of decoding possibles are: " + result);
    }
}