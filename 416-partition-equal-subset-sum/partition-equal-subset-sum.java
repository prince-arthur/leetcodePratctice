class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0)
            return false;
        else 
            return subsetSum(nums, nums.length, sum/2);
    }

    private boolean subsetSum(int[] arr, int n, int sum){
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i=0; i<n+1; i++){
            t[i][0] = true;
        }
        for(int i=0; i<sum+1; i++){
            t[0][i] = false;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1] <= j){
                    t[i][j] = (t[i-1][j-arr[i-1]] || t[i-1][j]);
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}