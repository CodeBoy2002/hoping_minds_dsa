import java.util.Scanner;

public class Fibbonacci {
    public static void printFibb(int a, int b, int n) {
        if(n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        printFibb(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        printFibb(a, b, n-2);
    }
}
