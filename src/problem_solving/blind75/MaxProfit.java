package problem_solving.blind75;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int sale = 0;

        for (int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            sale = prices[i] - min;

            if (sale > max){
                max = sale;
            }
        }
        return max;
    }

    public static int maxProfit2(int[] prices) {
        int profit = -prices[0];
        for (int i = 0; i < prices.length; i++) {
            int profitCheck = -prices[i];
            for (int j = i + 1; j < prices.length - 1; j++) {
                if ((profitCheck + prices[j]) > profit) {
                    profit = profitCheck + prices[j];
                }
            }
        }
        return profit;

    }
}
