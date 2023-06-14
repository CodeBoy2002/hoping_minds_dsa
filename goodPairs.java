public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = findTheGoodPairs(nums);
        System.out.println(result);
    }
    public static int findTheGoodPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n; j++) {
                if(nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }

        return count;
    }
}
