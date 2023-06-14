public class curtanLength {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3, 42, 60, 6, 14};
        int result = findTotalCurtains(arr, n);
        System.out.println(result);
    }

    public static int findTotalCurtains(int[] nums, int n) {
        int total_length = 0;
        for(int i = 0; i < nums.length; i++) {
            total_length += (nums[i] / 12);
        }

        return total_length;
    }
}
