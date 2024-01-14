class Solution {
    public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		Arrays.fill(ans, 1);
		int right=1, left=1;
		for(int i=0; i<n ;i++) {
			ans[i]*=left;
			left*=nums[i];
		}
		for(int j=n-1; j>=0; j--) {
			ans[j]*=right;
			right*=nums[j];
		}
		return ans;
	}
}