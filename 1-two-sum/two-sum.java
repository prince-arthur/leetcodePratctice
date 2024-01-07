class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
		int numLength = nums.length;
		for(int i=0; i < numLength; i++) {
			map.put(nums[i],i);
		}
		
		for(int i=0; i < numLength; i++) {
			int val = target-nums[i];
			if(map.containsKey(val) && map.get(val)!=i) {
				return new int[] {i,(int)map.get(val)};
			}
		}
		return new int[] {-1,-1};
    }
}