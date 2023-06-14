import java.util.Scanner;


//TCS ASKED
public class primeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        int result = findNthNumber(n);
        System.out.println(n + "th Number will be: " + result);
    }

    public static int findNthNumber(int n) {
        int[] number = new int[1000];
        number[1] = 1;
        int count = 1;
        int num = 1;

        while(count <= n) {
            num++;
            if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
                count++;
                number[count] = num;
            }
        }

        return number[n];
    }
}
