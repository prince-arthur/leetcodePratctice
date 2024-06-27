class Solution {
    public int maxFrequency(int[] nums, long k) {
        int left=0, right;
        Arrays.sort(nums);
        for(right=0; right<nums.length; ++right) {
            k+=nums[right];
            if(k < (long)nums[right] * (right - left + 1)) {
                k-=nums[left++];
            }
        }
        return right - left;
    }
}