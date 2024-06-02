class Solution {
    public int longestPalindromeSubseq(String s) {
        return longestCommonSubseq(s, new StringBuilder(s).reverse().toString());
    }

    private int longestCommonSubseq(String a, String b){
        char[] x = a.toCharArray(), y = b.toCharArray();
        int m = x.length, n = y.length;
        int[][] cache = new int[m+1][n+1];
        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                if(i==0||j==0){ 
                    cache[i][j] = 0;
                } else if(x[i-1]==y[j-1]) {
                    cache[i][j] = 1 + cache[i-1][j-1];
                } else {
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
                }
            }
        }
        return cache[m][n];
    }
}