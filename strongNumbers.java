import java.util.*;
public class strongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findTheNumber(arr);
        System.out.println(result);
    }

    public static int findTheNumber(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if(isStrongNum(num)) {
                count++;
            }
        }
        return count;
    } 

    public static boolean isStrongNum(int num) {
        int x = num;
        int sum = 0;
        while(x > 0) {
            int y = 0;
            y = x % 10;
            sum += factorialNumber(y);
            x /= 10;
        }

        if(sum == num) {
            return true;
        }

        return false;
    } 

    public static int factorialNumber(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
