class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums) sum+=i;
        int s2Sum = (sum-target)/2;
        return ((sum < target) || (sum+target)%2>0 )?0:countSubsetSum(nums,s2Sum,nums.length);
    }

    private int countSubsetSum(int[] arr, int sum, int n){
        int[][] cache = new int[n+1][sum+1];
        cache[0][0] = 1;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                cache[i][j] = cache[i-1][j];
                if(arr[i-1] <= j){
                    cache[i][j] += cache[i-1][j-arr[i-1]];
                }
            }
        }
        return cache[n][sum];
    }
}