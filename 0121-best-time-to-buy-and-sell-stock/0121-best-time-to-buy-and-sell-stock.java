class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price: prices){
             //find min price
            if(price<minPrice){
                minPrice = price;
            }
            // Calculate max profit
            else {
                int profit = price - minPrice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }

        return maxprofit;
    }
}