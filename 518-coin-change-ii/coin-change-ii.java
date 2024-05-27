class Solution {
    public int change(int sum, int[] coins) {
        int n = coins.length;
        int[][] cache = new int[n+1][sum+1];
        for(int i=0; i<n+1; i++) cache[i][0] = 1;
        for(int i=1; i<sum+1; i++) cache[0][i] = 0;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                cache[i][j] = cache[i-1][j];
                if(coins[i-1] <= j){
                    cache[i][j] += cache[i][j-coins[i-1]];
                }
            }
        }
        return cache[n][sum];
    }
}