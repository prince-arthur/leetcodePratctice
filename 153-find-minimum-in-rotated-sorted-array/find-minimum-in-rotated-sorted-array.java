class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n==0) return 0;
        if(n==1) return nums[0];
        return findMin(nums, n);
    }

    private int findMin(int[] arr, int n) {
        int start = 0, end = n - 1;
        while(start <= end) {
            if(arr[start] <= arr[end]) return arr[start];
            int mid = start + (end - start)/2;
            if(arr[mid] >= arr[start]) start = mid + 1;
            else end = mid;
        }
        return 0;
    }
}