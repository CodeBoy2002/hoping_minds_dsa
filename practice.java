import java.util.*;
public class practice {
    public static void main(String[] args) {
        int[] marks = {5, 3, 2, 1, 4};
        int k = 2;
        int n = 5;
        int result = getCandidates(marks, n, k);
        System.out.println(result);
    }

    public static int getCandidates(int[] nums, int n, int k) {
        Arrays.sort(nums); // 1 2 3 4 5
        int cuttOff = nums[n-k];
        int selected = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] >= cuttOff) {
                selected++;
            }
        }

        return selected;
    }
}