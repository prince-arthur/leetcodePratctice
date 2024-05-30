class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        if(n==0) return 0;
        char[] x = s.toCharArray(), y = new StringBuilder().append(s).reverse().toString().toCharArray();
        int[][] cache = new int[n+1][n+1];
        for(int i=0; i<n+1; i++){ 
            cache[i][0] = 0; 
            cache[0][i] = 0;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(x[i-1] == y[j-1]){
                    cache[i][j] = 1 + cache[i-1][j-1];
                } else {
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
                }
            }
        }
        return n-cache[n][n];
    }
}