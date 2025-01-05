class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for(int i: nums) {
            if(i == 1) {
                count++;
            } else {
                maxCount = count > maxCount ? count : maxCount;
                count = 0;
            }
        }
        return maxCount = count > maxCount ? count : maxCount;
    }
}