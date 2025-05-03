class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int target = nums[left] + nums[right] + nums[i];
                if(target == 0) {
                    List<Integer> tempAns = Arrays.asList(nums[left], nums[right], nums[i]);
                    list.add(tempAns);

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if(target < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
	}
    
}