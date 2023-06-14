import java.util.*;

public class measurmentInch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = calculateTotalFeet(arr);
        System.out.println("Total measurment in feet: " + result);
    }

    public static int calculateTotalFeet(int[] nums) {
        int totalFeet = 0;
        for(int num: nums) {
            if(num >= 12) {
                totalFeet += num / 12;
            }
        }
        return totalFeet;
    }
}
