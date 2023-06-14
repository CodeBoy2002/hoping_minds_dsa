public class suffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 5, 7};
        int[] result = getTheSuffledArray(nums);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] getTheSuffledArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[2*n];
        int index = 0;
        for(int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i+n];
        }

        return result;
    }
}
