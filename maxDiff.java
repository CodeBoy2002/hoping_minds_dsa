import java.util.*;

public class maxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMaxDiff(arr);
        System.out.println("Max diff of the array elements will be: " + result);
    }

    public static int findMaxDiff(int[] nums) {
        int diff = 0;
        int max = 0;

        for(int i = 1; i < nums.length; i++) {
            diff += nums[i] - nums[i-1];
            max = Math.max(diff, max);
        }

        return max;
    }
}