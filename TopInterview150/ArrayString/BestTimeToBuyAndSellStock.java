package TopInterview150.ArrayString;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 3, 5, 1, 6, 4};
        int soFarMinimum = prices[0], maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < soFarMinimum)
                soFarMinimum = prices[i];
            else {
                int profit = prices[i] - soFarMinimum;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println(maxProfit);
    }
}
