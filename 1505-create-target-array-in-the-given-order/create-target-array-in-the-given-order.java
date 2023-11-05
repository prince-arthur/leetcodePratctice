class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            ans.add(index[i], nums[i]);
        }
        int size = ans.size();
        int[] target = new int[size];
        for(int i=0; i<size; i++){
            target[i] = ans.get(i);
        }
        return target;
    }
}