class Solution {
    boolean isPalindrome(String s,int start,int end){
		while(start<end){
			if(s.charAt(start)!=s.charAt(end))return false;
			start++;
			end--;
		}
		return true;
	}
	int getMinCutsUtil(String s,int start,int end,int[][] dp){
		if(start>=end)return 0;
		if(isPalindrome(s,start,end)==true)return dp[start][end]=0;
		if(dp[start][end]!=-1)return dp[start][end];
		int mini=Integer.MAX_VALUE;
		for(int i=start;i<end;i++){
			int res=Integer.MAX_VALUE;
			if(isPalindrome(s,start,i)){
				res=1+getMinCutsUtil(s,i+1,end,dp);
			}
			mini=Math.min(mini,res);
		}
		return dp[start][end]=mini;
	}
    public int minCut(String s) {
        int[][] dp=new int[s.length()][s.length()];
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				dp[i][j]=-1;
			}
		}
		return getMinCutsUtil(s,0,s.length()-1,dp);
    }
}