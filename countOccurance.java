public class countOccurance {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        int digit = 1;

        int count = countDigitInNumber(start, end, digit);
        System.out.println(count);
    }

    public static int countDigitInNumber(int start, int end, int digit) {
        int count = 0;
        for(int i = start; i <= end; i++) {
            count += countOne(i, digit);
        }
        return count;
    }

    public static int countOne(int number, int digit) {
        int count = 0;
        while(number != 0) {
            int remainder = number % 10;
            if(remainder == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
