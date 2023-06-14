public class countMinimum {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int n = nums.length;
        int[] result = findMinimumCount(nums, n);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
    public static int[] findMinimumCount(int[] nums, int n) {
        int[] result = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            count = getCount(nums, nums[i]);
            result[i] = count;
        }
        return result;
    }

    public static int getCount(int[] nums, int num) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(num > nums[i]) {
                count++;
            }
        }

        return count;
    }
}
