class Solution {
    public int majorityElement(int[] nums) {
        return majorityElement(nums, nums.length);
    }

    private int majorityElement(int[] nums, int n){
        int count = 0, major = 0;
        for(int num: nums) {
            if(count == 0) major = num;
            
            if(major == num) count++;
            else count--;
        }
        return major;
    }
}