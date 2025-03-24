class Solution {
    public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
        Arrays.fill(res,1);
        int[] prefix = new int[n];
        int[] postfix = new int[n];

        prefix[0] = 1;
        for(int i=1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        postfix[n-1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i+1] * nums[i+1];
        }

        for(int i = 0; i < n; i++) {
            prefix[i] = prefix[i] * postfix[i];
        }

        return prefix;
	}
}