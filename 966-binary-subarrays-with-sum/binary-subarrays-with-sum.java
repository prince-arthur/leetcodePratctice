class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        if(goal < 0) return 0;
        int count = 0, left = 0;
        for(int right = 0; right < nums.length; right++) {
            goal-=nums[right];
            while(goal < 0) { 
                goal+=nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
}