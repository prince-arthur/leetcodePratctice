class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int price: prices) {
            if(min > price) min = price;
            if(max < price - min) max = price - min;
        }
        return max;
    }
}