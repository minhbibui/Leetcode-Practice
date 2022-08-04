import array.bestTimeToBuyAndSellStock;
public class run {
    public static void main(String[] args)
    {
        // ---------------------------------------------------------------------------
        // Test best time to buy stock function
        bestTimeToBuyAndSellStock bestTime = new  bestTimeToBuyAndSellStock();
        int[] stockPrice = new int[5];
        stockPrice[0] = 4;
        stockPrice[1] = 2;
        stockPrice[2] = 5;
        stockPrice[3] = 3;
        stockPrice[4] = 7;
        System.out.println(bestTime.maxProfit(stockPrice));

    }
}
