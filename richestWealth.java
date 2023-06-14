public class richestWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int result = maximumWealth(accounts);
        System.out.println(result);

    }

    public static int maximumWealth(int[][] acounts) {
        int maxWealth = 0;
        for(int[] customer: acounts) {
            int wealth = 0;
            for(int account: customer) {
                wealth += account;
            }

            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    } 
}
