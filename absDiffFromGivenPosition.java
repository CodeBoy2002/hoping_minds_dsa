import java.util.*;

public class absDiffFromGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to find the absolute difference: ");
        int pos = sc.nextInt();

        int result = findTheAbsDiff(arr, pos);
        System.out.println("Absolute difference between the numbers: " + result);
    }

    public static int findTheAbsDiff(int[] nums, int pos) {
        int sum = 0;
        int abs_diff = 0;

        for(int i = pos; i < nums.length; i++) {
            abs_diff = Math.abs(nums[i] - nums[i-1]);
            sum += abs_diff;
        }

        return sum;
    }
}
