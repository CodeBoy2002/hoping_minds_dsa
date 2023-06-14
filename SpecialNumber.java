public class SpecialNumber {
    public static void main(String[] args) {
        int num = 15;
        int digit_sum = 0;
        int digit_mul = 1;
        int n = num;
        while(n > 0) {
            digit_sum += n % 10;
            digit_mul *= n % 10;
            n /= 10;
        }
        if((digit_mul + digit_sum) == num) {
            System.out.println("Special");
        }else {
            System.out.println("Not special");
        }
        
    }
}
