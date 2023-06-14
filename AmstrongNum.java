import java.util.Scanner;

public class AmstrongNum {
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
            if(isAmstrongNumber(num)) {
                count++;
            }    
        }

        return count;
    }

    public static boolean isAmstrongNumber(int num) {
        int x = num;
        int sum = 0;
        while(x > 0) {
            int y = 0;
            y = x % 10;
            sum += Math.pow(y, 3);
            x /= 10;
        }

        if(sum == num) {
            return true;
        }

        return false;
    }

}
