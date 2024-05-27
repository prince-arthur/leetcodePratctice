class Solution {
    public int coinChange(int[] coins, int sum) {
        int n = coins.length, max = Integer.MAX_VALUE-1;
        int[][] cache = new int[n+1][sum+1];
        for(int i=1; i<n+1; i++) cache[i][0] = 0;
        for(int i=0; i<sum+1; i++) cache[0][i] = max;
        for(int j=1; j<sum+1; j++){
            if(j%coins[0] == 0){
                cache[1][j] = j/coins[0];
            } else {
                cache[1][j] = max;
            }
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(coins[i-1] <= j){
                    cache[i][j] = Math.min(1 + cache[i][j-coins[i-1]], cache[i-1][j]);
                } else {
                    cache[i][j] = cache[i-1][j];
                }
            }
        }
        return cache[n][sum] == max ? -1:cache[n][sum];
    }
}