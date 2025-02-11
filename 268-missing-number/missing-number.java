class Solution {

    public int missingNumber(int[] nums) {
        int currSum = 0, n = nums.length, totalSum = n*(n+1)/2;
        for(int i: nums) currSum+=i;
        return totalSum - currSum;
    }
    
}