class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int count_0 = 0;
        int ans = 0;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) count_0++;
            if(count_0 > k && nums[left++] == 0) count_0--;
            ans = right - left + 1;
        }
        return ans;
    }
}