class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindowHelper(nums, k) - slidingWindowHelper(nums, k - 1);
    }

    private int slidingWindowHelper(int[] nums, int k) {
        int n = nums.length, left = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++) {
            if(map.getOrDefault(nums[right], 0) == 0) k--;
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(k < 0) {
                map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                if(map.get(nums[left]) == 0) k++;
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}