import java.util.Scanner;

public class maxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int result = maximumSubarr(arr);
        int result = findTheDiff(arr);
        System.out.println(result);
    }

    public static int maximumSubarr(int[] nums) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        int sum = 0; 
        int max = nums[0];
        for(int num: nums) {
            sum += num;
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }

        return sum;
    }

    //Finding the Nth prime number
    public static int findNthPrimeNumber(int n) {
        int[] number = new int[1000];
        number[1] = 1;
        int count = 1;
        int num = 1;

        while(count <= n) {
            num++;
            if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
                count++;
                number[count] = num;
            }
        } 

        return number[n];
    }

    //Program to difference between smallest and largest number
    public static int findTheDiff(int[] nums) {
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
