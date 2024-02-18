class Solution {
    public int findDuplicate(int[] nums) {
        // return findDuplicate_negMark(nums);
		return findDuplicate_bool(nums);
	}

    private int findDuplicate_negMark(int[] nums){
        for(int num:nums) {
			int index = Math.abs(num);
			if(nums[index]<0) {
				return index;
			}
			nums[index] = -nums[index];
		}
		return 0;
    }
    
    private static int findDuplicate_bool(int[] nums) {
		int numLength = nums.length;
		boolean[] arr = new boolean[numLength+1];
		for(int num=0; num < numLength; num++) {
			if(arr[nums[num]]) return nums[num];
			arr[nums[num]] = true;
		}
		return -1;
	}
}