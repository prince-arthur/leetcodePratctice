class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0, count = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1) {
                k--;
                count = 0;
            }
            while(k == 0) {
                if(nums[j] % 2 == 1) k++;
                count++;
                j++;
            }
            ans+=count;
        }
        return ans;
    }
}