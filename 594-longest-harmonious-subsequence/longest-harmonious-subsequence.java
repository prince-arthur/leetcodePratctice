class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0) + 1);
            if(map.containsKey(i-1)){ 
                maxLen = Math.max(maxLen, map.get(i) + map.get(i-1));
            }
            if(map.containsKey(i+1)){
                maxLen = Math.max(maxLen, map.get(i) + map.get(i+1));
            }
        }
        return maxLen;
    }
}