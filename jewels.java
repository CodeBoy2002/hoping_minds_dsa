public class jewels {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbb";
        int result = countTheJewels(jewels, stones);
        System.out.println(result);
    }

    public static int countTheJewels(String jewels, String stones) {
        int[] jewelsCounts = new int[128];

        for(char jewel: jewels.toCharArray()) {
            int index = (int) jewel;
            jewelsCounts[index]++;
        }
        
        int jewelsCount = 0;
        
        for(char stone: stones.toCharArray()) {
            int index = (int) stone;
            if(jewelsCounts[index] > 0) {
                jewelsCount++;
            }
        }

        return jewelsCount;
    }
}
