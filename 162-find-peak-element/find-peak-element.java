class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return 0;
        return modifiedBinarySearch(nums, n);
    }

    private int modifiedBinarySearch(int[] nums, int n) {
        int start = 0, end = n - 1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[mid+1])
                start = mid + 1;
            else 
                end = mid;
        }
        return start;
    }
}