public class automorphicNumber {
    public static void main(String[] args) {
        int num = 25;
        boolean isAutomorphic = checkForAutomorphic(num);
        if(isAutomorphic) {
            System.out.println(num + " is automorphic number");
        } else {
            System.out.println(num + " is not automorphic number");
        }
    }

    public static boolean checkForAutomorphic(int n) {
        if(n == 0) {
            return true;
        }
        int sq = n * n;
        String numberStr = String.valueOf(n);
        String squareStr = String.valueOf(sq);

        return squareStr.endsWith(numberStr);
    }
}
