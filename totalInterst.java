import java.util.*;

public class totalInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of elements: ");
        int n = sc.nextInt();
        
        double[] arr = new double[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        double result = findTheInterest(arr);
        System.out.println("Total Interest on the Array of amounts will be: " + result);
    }
    public static double findTheInterest(double[] nums) {
        double totalInterest = 0;
        for(double num: nums) {
            if(num > 1000) {
                totalInterest += ((num * 0.10) * 0.01);
            }
        }
        return totalInterest;
    }
}
