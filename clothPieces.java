import java.util.Scanner;

public class clothPieces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findClothPieces(arr);
        System.out.println(result);
    }

    public static int findClothPieces(int[] nums) {
        int total_length = 0;
        int feet = 0;
        for(int i = 0; i < nums.length; i++) {
            feet += nums[i] / 10;
            total_length += feet;
        }

        return total_length;
    }
}
