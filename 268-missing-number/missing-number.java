class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length, sum=0, maxSum = n*(n+1)/2;
        for(int i: nums) sum+=i;
        return maxSum - sum;
    }
    
}