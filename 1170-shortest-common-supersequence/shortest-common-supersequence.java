class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        char[] x = str1.toCharArray(), y = str2.toCharArray();
        int m = x.length, n = y.length;
        int[][] cache = new int[m+1][n+1];
        for(int r[]:cache) Arrays.fill(r,0);
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(x[i-1] == y[j-1]){
                    cache[i][j] = 1 + cache[i-1][j-1];
                } else {
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
                }
            }
        }
        int scsLenght = m+n-cache[m][n], i = m, j = n;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            if(x[i-1] == y[j-1]){
                sb.append(x[i-1]);
                i--; j--;
            } else if(cache[i-1][j] > cache[i][j-1]) {
                sb.append(x[i-1]);
                i--;
            } else {
                sb.append(y[j-1]);
                j--;
            }
        }
        while(i-->0) sb.append(x[i]);
        while(j-->0) sb.append(y[j]);

        return sb.reverse().toString();
    }
}