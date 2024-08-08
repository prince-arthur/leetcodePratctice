class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        return binarySearchRotated(nums, nums.length, target);
    }

    private int binarySearchRotated(int[] arr, int n, int target) {
        int start = 0, end = n - 1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            if(arr[mid] < arr[start]) {
                if(arr[start] <= target || target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] < target || target < arr[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return arr[start] == target ? start:-1;
    }
}