public class countSpecificNumber {
    public static void main(String[] args) {
        int total_num = getSpecificNumber(100, 200);
        System.out.println(total_num);
    }

    public static int getSpecificNumber(int m, int n) {
        int count = 0;
        if(m > n) {
            return -1;
        }
        for(int i = m; i < n; i++) {
            if(containsSpecific(i)) {
                count++;
            }
        }

        return count;
    }

    public static boolean containsSpecific(int num) {
        while(num > 0) {
            int digit = num % 10;
            if(digit != 1 && digit != 4 && digit != 9) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
