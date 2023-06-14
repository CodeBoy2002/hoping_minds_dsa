// Alos known as Niven numbers

public class HarshadNumber {
    public static void main(String[] args) {
        int num = 156;
        int x = num;
        int sum = 0;
        while(x != 0) {
            sum += x % 10;
            x /= 10;
        }
        if(num % sum == 0) {
            System.out.println("Given number is Niven Number");
        } else {
            System.out.println("Not a Niven number");
        }
    }
}
