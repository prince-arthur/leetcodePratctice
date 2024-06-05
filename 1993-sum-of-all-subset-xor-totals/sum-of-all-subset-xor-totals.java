class Solution {
    public int subsetXORSum(int[] nums) {
        return helperMethod(nums, 0, 0);
    }

    private int helperMethod(int[] nums, int start, int currXor){
        if(start==nums.length) return currXor;
        int withEle = helperMethod(nums, start+1, currXor^nums[start]);
        int withoutEle = helperMethod(nums, start+1, currXor);
        return withEle + withoutEle;
    }
}