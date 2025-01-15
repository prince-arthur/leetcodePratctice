class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit = 0;
        for(int price: prices) {
            // if(minPrice > price) minPrice = price;
            // if(maxProfit < price - minPrice) maxProfit = price - minPrice;
            minPrice = minPrice > price ? price : minPrice;
            maxProfit = maxProfit < price - minPrice ? price - minPrice : maxProfit;
        }
        return maxProfit;
    }
}