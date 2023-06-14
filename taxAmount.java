import java.util.*;

public class taxAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of elements: ");
        int n = sc.nextInt();
        
        long[] arr = new long[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        int result = findTheTaxAmount(arr);
        System.out.println("Total tax that should be pay: " + result);
    }

    public static int findTheTaxAmount(long[] nums) {
        int totalTax = 0;
        for(long amount: nums) {
            if(amount <= 1000) {
                continue;
            }

            long taxableAmount = amount - 1000;
            int tax = (int) (taxableAmount * 0.1);
            totalTax += tax;
        }

        return totalTax;
    }
}
