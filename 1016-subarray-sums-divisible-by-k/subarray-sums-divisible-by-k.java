class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixCount = 0, count=0;
        for(int i: nums){
            prefixCount = (prefixCount + i % k + k) % k;
            count+=map.getOrDefault(prefixCount, 0);
            map.put(prefixCount, map.getOrDefault(prefixCount, 0)+1);
        }
        return count;
    }
}