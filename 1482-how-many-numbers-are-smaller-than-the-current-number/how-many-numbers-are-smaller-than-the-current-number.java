class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucketArr = new int[101];
        for(int i=0; i<nums.length; i++){
            bucketArr[nums[i]]+=1;
        }

        for(int i=1; i<=100; i++){
            bucketArr[i]+=bucketArr[i-1];
        }

        for(int i=0; i<nums.length; i++){
            int pos = nums[i];
            nums[i] = pos==0? 0:bucketArr[pos-1];
        }
        return nums;
    }
}