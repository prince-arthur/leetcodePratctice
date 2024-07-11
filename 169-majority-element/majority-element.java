class Solution {
    public int majorityElement(int[] nums) {
        return majorityElement(nums, nums.length);
    }

    private int majorityElement(int[] nums, int n) {
        int voter = 0, count = 0;
        for(int num: nums) {
            if(count == 0) voter = num;
            if(voter == num) count++;
            else count--;
        }
        return voter;
    }
}