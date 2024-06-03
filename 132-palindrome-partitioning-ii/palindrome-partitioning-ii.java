class Solution {
    public int minCut(String s) {
        char[] S = s.toCharArray();
        int i = 0, j = S.length - 1;
        int[][] t = new int[S.length+1][S.length+1];
        for(int row[]:t)
            Arrays.fill(row,-1);
        return solve(S,i,j,t);
    }
    public int solve(char[] S, int i, int j, int[][] t){
        if(i>=j)
            return 0;
        if(t[i][j]!=-1)
            return t[i][j];
        if(isPalindrome(S,i,j) == true)
            return 0;
        int min = Integer.MAX_VALUE, left = 0, right = 0;
        for(int k=i; k<j; k++){
             if(isPalindrome(S,i,k)){
                int temp=1+solve(S,k+1,j,t);
                min=Math.min(min,temp);
            }
        }
        return t[i][j] = min;
    }
    public boolean isPalindrome(char[] S, int i, int j){
        if(i>=j)
            return true;
        while(i<j){
            if(S[i]!=S[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}