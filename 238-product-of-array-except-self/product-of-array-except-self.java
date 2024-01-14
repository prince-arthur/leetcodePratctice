class Solution {
    public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		Arrays.fill(ans, 1);
		int right=1, left=1;
		for(int i=0, j=n-1; i<n && j>=0 ;i++, j--) {
			ans[i]*=left;
			left*=nums[i];
			
			ans[j]*=right;
			right*=nums[j];
		}
		return ans;
	}
}