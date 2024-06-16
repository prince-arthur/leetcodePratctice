class Solution {
    public int minPatches(int[] nums, int n) {
        long y = 0;
        int count = 0;
        int i = 0;
        while(y<n) {
            if(i>=nums.length || y < nums[i] - 1) {
                y += y+1;
                count++;
            } else {
                y+=nums[i];
                i++;
            }
        }
        return count;
    }
}