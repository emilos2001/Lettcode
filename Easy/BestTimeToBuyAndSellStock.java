package LeetCode.Easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int maxPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < maxPrice) {
                maxPrice = prices[i];
            } else if(prices[i] - maxPrice > profit) {
                profit = prices[i] - maxPrice;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
