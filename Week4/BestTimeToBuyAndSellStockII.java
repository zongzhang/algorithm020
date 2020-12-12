/**
 * @since 1.0
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int tmp;
        for (int i = 1; i < prices.length; i++) {
            tmp = prices[i] - prices[i - 1];
            if (tmp > 0) profit += tmp;
        }
        return profit;

    }
}
