class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftmost = binarySearchMod(nums, target);
        if(nums.length == leftmost || nums[leftmost] != target) {
            return new int[] {-1, -1};
        }
        return new int[] {leftmost, binarySearchMod(nums, target+1) - 1};
    }

    private int binarySearchMod(int[] nums, int target) {
        int start = 0, end = nums.length;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(nums[mid] < target) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}