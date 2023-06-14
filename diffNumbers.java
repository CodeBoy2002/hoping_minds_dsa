import java.util.Scanner;

public class diffNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findTheDifference(arr);
        System.out.println("The difference between smallest and largest number: " + result);
    }

    public static int findTheDifference(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }

        int smallest = nums[0];
        int largest = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < smallest) {
                smallest = nums[i];
            }
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest - smallest;
    }
}
