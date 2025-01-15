class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0, max = nums[0];
        for(int num: nums) {
            curr+=num;
            max = max > curr ? max : curr;
            if(curr < 0) curr = 0;
        }
        return max;
    }
}