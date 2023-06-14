public class runningSum {
    public static void main(String[] args) {
        int[] nums= {3, 1, 2, 10, 1};
        int[] result = findTheRunningSum(nums);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] findTheRunningSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        for(int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + nums[i]; 
        }
        return arr;
    }
}