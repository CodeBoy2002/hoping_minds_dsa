public class SpuNumber {
    public static void main(String[] args) {
        int num = 123;
        int x = num;
        int digit_sum = 0;
        int digit_mul = 1;
        while(x > 0) {
            digit_sum += x % 10;
            digit_mul *= x % 10;
            x /= 10;
        }

        if(digit_sum == digit_mul) {
            System.out.println("This is a spy numbers");
        } else {
            System.out.println("This is not spy numbers");
        }
    }
}
