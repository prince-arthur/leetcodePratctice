class Solution {
    public int findMin(int[] nums) {
		int n = nums.length;
		if(n==0 ) { 
			return 0; 
		} else if(n==1) {
			return nums[0];
		}
        return findMin(nums, n);
    }

    public int findMin(int[] nums, int n) {
    	int left = 0, right = n-1;
    	while(left<=right) {
    		if(nums[left] <= nums[right]) {
    			return nums[left];
    		}
    		int mid = left + (right - left)/2;
    		if(nums[mid] >= nums[right]) {
    			left = mid+1;
    		} else {
    			right = mid;
    		}
    	}
    	return 0;
    }
}