class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i: nums) {
            int index = Math.abs(i);
            if(nums[index - 1] > 0) nums[index - 1] *= -1;
        }
        for(int i=0; i < nums.length; i++) {
            if(nums[i] > 0) list.add(i+1);
        }
        return list;
    }
}