import java.util.Scanner;

public class commonFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = findCommonFact(a, b);
        System.out.println(result);
    }
    public static int findCommonFact(int n1, int n2) {
        int count = 0;
        for(int i = 1; i < n2; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                count++;
            }
        }

        return count;
    }
}
