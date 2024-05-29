class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        char[] x = text1.toCharArray(), y = text2.toCharArray();
        int[][] cache = new int[m+1][n+1];
        for(int[] r: cache){
            Arrays.fill(r,-1);
        }
        return longestCommonSubsequence(x, y, m, n, cache);
    }

    private int longestCommonSubsequence(char[] x, char[] y, int m, int n, int[][] cache){
        if(m==0||n==0) return 0;
        if(cache[m][n]!=-1) return cache[m][n];
        if(x[m-1] == y[n-1]){
            cache[m][n] = 1 + longestCommonSubsequence(x, y, m-1, n-1, cache);
        } else {
            cache[m][n] = Math.max(longestCommonSubsequence(x, y, m-1, n, cache), 
                                    longestCommonSubsequence(x, y, m, n-1, cache));
        }
        return cache[m][n];
    }
}