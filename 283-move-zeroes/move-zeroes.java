class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right]!= 0) {
                swap(left, right, nums);
                left++;
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}