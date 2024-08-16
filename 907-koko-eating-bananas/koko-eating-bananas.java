class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = findMax(piles);
        int left = 1, right = max;
        while(left <= right) {
            int mid = left + (right - left)/2, 
                totalHours = calculateTotalHours(piles, mid);
            if(totalHours > h) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    private int calculateTotalHours(int[] piles, int hours) {
        int totalHours = 0;
        for(int i = 0; i < piles.length; i++) {
            totalHours += Math.ceil((double)(piles[i]) / (double)hours);
        }
        return totalHours;
    }

    private int findMax(int[] piles){
        int largestPile = Integer.MIN_VALUE;
        for(int i: piles) {
            largestPile = Math.max(i, largestPile);
        }
        return largestPile;
    }
}