class Solution {
	public int longestConsecutive(int[] nums) {
		return longestConsecutive(nums, nums.length);
	}

	public int longestConsecutive(int[] nums, int n) {
		Set<Integer> set = new HashSet<>();
		for(int i:nums){
			set.add(i);
		}
		
		int largestCount = 0;
		for(int i=0; i<n; i++) {
			if(set.contains(nums[i])) {
				set.remove(nums[i]);
				int largestCountToLeft=0;
				int j = nums[i]-1;
				while(set.contains(j)){
						largestCountToLeft++;
						set.remove(j--);
				}
				int largestCountToRight = 0;
				j=nums[i]+1;
				while(set.contains(j)){
						largestCountToRight++;
						set.remove(j++);
				}
				int totalLength = 1 + largestCountToLeft + largestCountToRight;
				largestCount = Math.max(totalLength,largestCount);
			} else {
				continue;
			}
		}
		return largestCount;
	}
}