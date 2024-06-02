class Solution {
    static int[][] cache = new int[2001][2001];
    public int minCut(String s) {
        char[] x = s.toCharArray();
        int i=0, j=x.length-1;
        for(int[] r:cache) Arrays.fill(r, -1);
        return minCut(x, i, j);
    }
    private int minCut(char[] x, int i, int j){
        if(i>=j) return 0;
        if(cache[i][j]!=-1) return cache[i][j];
        if(isPalindrome(x, i, j)) return 0;
        int min = Integer.MAX_VALUE, left=0, right=0;
        for(int k=i; k<j; k++){
            // if(cache[i][k]!=-1) return cache[i][k];
            // else {
            //     left = minCut(x, i, k);
            //     cache[i][k] = left;
            // }
            int temp = Integer.MAX_VALUE;
            if(isPalindrome(x, i, k)){
                temp = 1+minCut(x, k+1, j);
            }
            // if(cache[k+1][j]!=-1) return cache[k+1][j];
            // else {
            //     right = minCut(x, k+1, j);
            //     cache[k+1][j] = right;
            // }
            // int temp = left + right + 1;
            min = Math.min(min, temp);
        }
        return cache[i][j] = min;
    }
    private boolean isPalindrome(char[] x, int i, int j) {
        if(i==j || i>j) return true;
        while(i<j){
            if(x[i]!=x[j]) return false;
            i++; j--;
        }
        return true;
    }
}