class Solution {
    public void rotate(int[] nums, int k) {
		k = k % nums.length;
		int numsLength = nums.length;
		reverse(nums, 0, numsLength-1);
		reverse(nums, 0,k-1);
		reverse(nums,k,numsLength-1);
	}
	
	private int[] reverse(int nums[], int i, int j) {
		while(i<j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		return nums;
	}
}