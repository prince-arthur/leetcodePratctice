class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }

    private int binarySearch(int[] nums, int k) {
        int start = 0, end = nums.length-1, ans = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == k)
                return mid;
            else if(nums[mid] < k) 
                start = mid + 1;
            else 
                end = mid - 1;
        }
        return -1;
    }
}