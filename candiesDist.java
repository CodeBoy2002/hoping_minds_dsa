public class candiesDist {
    public static void main(String[] args) {
        int[] candies = {2, 3, 1, 3};
        int extraCandy = 3;
        boolean[] flag = findTheMaxCandy(candies, extraCandy);
        for(int i = 0; i < flag.length; i++) {
            System.out.print(flag[i] + " ");
        } 

    }

    public static boolean[] findTheMaxCandy(int[] nums, int extra) {
        int n = nums.length;
        boolean[] flag = new boolean[n];
        for(int i = 0; i < nums.length; i++) {
            if(extra != 0) {
                nums[i] += 1;
                extra--;
                flag[i] = true;
            } else {
                flag[i] = false;
            }
        }

        return flag;
    }
}
