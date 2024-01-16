class Solution {
     //2 pointers
    public List<List<Integer>> threeSum(int[] nums) {
        int numsLength = nums.length;
		Arrays.sort(nums);										//[-4,-1,-1,0,1,2]
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		for(int i=0; i<numsLength-2; i++) {
			if(i==0 || (i>0 && nums[i] != nums[i-1])) {
				int target = 0-nums[i];
				int left = i + 1;
				int right = numsLength-1;
				
				while(left<right) {
					if(nums[left] + nums[right] == target) {
						List<Integer> currSoln = new ArrayList<>();
						currSoln.add(nums[i]);
						currSoln.add(nums[left]);
						currSoln.add(nums[right]);
						list.add(currSoln);
						
						while(left < right && nums[left] == nums[left + 1]) {
							left++;
						}
						
						while(left < right && nums[right] == nums[right-1]) {
							right--;
						}
						left++;
						right--;
					} else if(nums[left] + nums[right] > target) {
						right--;
					} else {
						left++;
					}
				}
			}
		}
		return list;
	}
}