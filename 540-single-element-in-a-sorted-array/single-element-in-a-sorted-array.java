class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        return bianrySearchMod(nums, n);
    }

    private int bianrySearchMod(int[] nums, int n) {
        int start = 0, end = n - 1;
        while(start < end) {
            int mid = start + (end - start)/2;
            // if(nums[mid] != nums[mid - 1] && nums[mid]!= nums[mid+1]) return nums[mid];
            if (((mid % 2 == 1) && nums[mid] == nums[mid - 1]) || 
                ((mid % 2 == 0) && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}