import java.util.Arrays;

public class binarySearch {
    public static int searchBinary(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            
            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 2, 9, 4, 22};
        int target = 9;
        int result = searchBinary(arr, target);

        if(result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Not found");
        }
    }
}
