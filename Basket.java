import java.util.*;

public class Basket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of apples: ");
        int a = sc.nextInt();
        System.out.println("Enter the no. of mangoes: ");
        int m = sc.nextInt();
        System.out.println("Enter the amount you have: ");
        int rs = sc.nextInt();

        int result = getTheRemainingAmount(a, m, rs);
        System.out.println("Remaining amount that we left is: " + result);

    }

    public static int getTheRemainingAmount(int apples, int mangoes, int ruppe) {
        if (apples > mangoes) {
            int buyMangoes = apples - mangoes;
            ruppe -= buyMangoes;
        }
        if (apples < mangoes) {
            int sellMangoes = mangoes - apples;
            ruppe += sellMangoes;
        }

        return ruppe;
    }
}
