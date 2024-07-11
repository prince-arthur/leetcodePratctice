class Solution {
    public int majorityElement(int[] nums) {
        return majorityElement(nums, nums.length);
    }

    private int majorityElement(int[] nums, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i: map.keySet()) {
            if(map.get(i) > n/2) return i;
        }
        return 0;
    }
}