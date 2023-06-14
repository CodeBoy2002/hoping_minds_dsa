import java.util.*;

public class diffOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result= findSumOfNum(arr);
        System.out.println("Difference of Sum of Odd and Even numbers is: " + result);

    }

    public static int findSumOfNum(int[] nums) {
        int diff = 0;
        int sum_odd = 0;
        int sum_even = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                sum_even += nums[i];
            } else {
                sum_odd += nums[i];
            }
        }

        diff = sum_odd - sum_even;
        return diff;
    }
}
