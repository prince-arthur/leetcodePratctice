class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int res = 0;
        int expecPrevNumOfOne = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i >= k && nums[i - k] < 0) expecPrevNumOfOne--;
            if (expecPrevNumOfOne % 2 == nums[i]) {
                if (i + k > n) return -1;
                nums[i] = -1;
                expecPrevNumOfOne++;
                res++;
            }
        }
        return res;
    }
}