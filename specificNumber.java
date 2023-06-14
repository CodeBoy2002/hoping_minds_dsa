import java.util.Scanner;

public class specificNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = countNumbersInRange(n1, n2);
        System.out.println(result);
    }

    public static int countNumbersInRange(int m, int n) {
        if(m > n) {
            return -1;
        }
        int count = 0;
        for(int i = m; i <= n; i++) {
            String numStr = String.valueOf(i);
            if(isContainNum(numStr)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isContainNum(String newString) {
        for(char ch: newString.toCharArray()) {
            if(ch != '1' && ch != '4' && ch != '9') {
                return false;
            }
        }
        return true;
    }
}
