class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;
        int r2 = n - 1;
        int pos = m + n - 1;

        while(r2 >= 0){
            if(r1 >= 0)
                nums1[pos--] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            else
                nums1[pos--] = nums2[r2--];
        }
    }
}