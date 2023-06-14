public class appendSubstr {
    public static void main(String[] args) {
        String str = "abab";
        if(isSubstring(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean isSubstring(String s) {
        int n = s.length();

        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder sc = new StringBuilder();

                for(int j = 0; j < n / i; j++) {
                    sc.append(substring);
                }

                if(sc.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}