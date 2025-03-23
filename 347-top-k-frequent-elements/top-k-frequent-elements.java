class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.merge(num, 1, Integer::sum);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for(int key: freqMap.keySet()) {
            int frequency = freqMap.get(key);
            if(buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> result = new ArrayList<>();
        for(int freq = nums.length; freq>=0; freq--){
            for(int num: buckets[freq]){
                result.add(num);

                if(result.size() == k){
                    return result.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
	}
}