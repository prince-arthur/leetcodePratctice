class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer>[] bucket = new List[nums.length+1];
		for(int num: nums) {
        	map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int key: map.keySet()) {
        	int fq = map.get(key);
        	if(bucket[fq]==null) {
        		bucket[fq] = new ArrayList<>();
        	}
        	bucket[fq].add(key);
        }
        
        int[] res =new int[k];
        int counter = 0;
       
        for(int i=bucket.length-1; i>=0; i--) {
        	if(counter<k && bucket[i]!=null) {
        		for(Integer pos:bucket[i]) {
        			res[counter++] = pos;
        		}
        	}
        }
        return res;
	}
}