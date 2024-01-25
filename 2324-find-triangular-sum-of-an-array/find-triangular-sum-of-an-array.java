class Solution {
    public int triangularSum(int[] nums) {
		return triangularSum(nums, nums.length);
	}
	
	public int triangularSum(int[] nums, int numsLength) {
		while(numsLength > 1) {
			for(int i=0; i<numsLength-1 ; i++) {
				nums[i] = (nums[i] + nums[i+1])%10;
			}
			numsLength--;
		}
		return nums[0];
	}
}