class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] neg = new int[nums.length/2], pos = new int[nums.length/2];
        int i = 0, j=0;
        for(int num: nums) {
            if(num < 0) neg[i++] = num;
            else      pos[j++] = num;
        }
        int[] ans = new int[nums.length];
        for(int k = 0; k<nums.length/2; k++){
            ans[2*k] = pos[k];
            ans[2*k + 1] = neg[k];
        }
        return ans;
    }
}