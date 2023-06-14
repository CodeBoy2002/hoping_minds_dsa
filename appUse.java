import java.util.Scanner;

public class appUse {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 1};
        System.out.println("ALT+TAB Press: ");
        int K = 3;
        
        int[] result = printAllTab(arr, K);
        for(int num: result) {
            System.out.print(num + " ");
        }
    }

    public static int[] printAllTab(int[] nums, int K) {
        int n = nums.length;
        int[] result = new int[n];

        //arr[] = {3, 5, 2, 4, 1}
        //k = 3
        //output = {4 3 5 2 1}

        for(int k = 0; k < K; k++) {

            for(int i = n - 1; i > 0; i--) {
                result[i] = nums[i - 1];
            }
            result[0] = nums[n - 1];

            for(int i = 0; i < n; i++) {
                nums[i] = result[i];
            }
        }
        return nums;
    }
}


