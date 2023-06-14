public class balanceFruitBasket {
    public static void main(String[] args) {
        int remaining_amount = balanceBasket(8, 5, 10);
        System.out.println(remaining_amount);
    }

    public static int balanceBasket(int a, int m, int rs) {
        if(a > m) {
            int mangoToBuy = a - m;
            rs -= mangoToBuy;
        } else if(a < m) {
            int mangoesToSell = m - a;
            rs += mangoesToSell;
        }

        return rs;
    }
}
