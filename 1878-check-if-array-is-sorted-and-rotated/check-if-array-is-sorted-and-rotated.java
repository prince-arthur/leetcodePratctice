class Solution {
    public boolean check(int[] nums) {
        int breakpoints = 0, n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i+1) % n]) breakpoints++;
        }
        return breakpoints <=1;
    }
}