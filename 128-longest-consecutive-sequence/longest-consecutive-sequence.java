class Solution {
	public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        return longestConsecutive(nums, n);
    }

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
}