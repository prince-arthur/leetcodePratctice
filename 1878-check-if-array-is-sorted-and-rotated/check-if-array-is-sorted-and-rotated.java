class Solution {
    public boolean check(int[] nums) {
        int breakpoints = 0, n = nums.length;
        for(int i = 1; i < n; i++) {
            if(nums[i] < nums[i-1]) breakpoints++;
        }
        if(breakpoints == 0) return true;
        if(breakpoints == 1 && nums[0] >= nums[n-1]) return true;
        return false;
    }
}