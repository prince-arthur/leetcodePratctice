class Solution {
	public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        return longestConsecutive(nums, n);
    }

    private int longestConsecutive(int[] nums, int n) {
        int max = n == 0 ? 0 : 1;
        int count = 1;
        Arrays.sort(nums);
        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1] + 1) {
                count++;
                max = count > max ? count : max;
            } else {
                count = 1;
            }
        }
        return max;
    }

    /* 
    private int longestConsecutive(int[] nums, int n){
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            set.add(i);
        }
        int longest = 1;
        for(int i: set) {
            if(!set.contains(i-1)){
                int cnt = 1;
                int x = i;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
    */
}