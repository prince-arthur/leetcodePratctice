class Solution {
    public boolean containsDuplicate(int[] nums) {
		boolean result = false;
		Set<Integer> set = new HashSet<>();
		for(int num:nums) {
			if(set.contains(num)) {
				return true;
			} else {
				set.add(num);
			}
		}
        return false;
	}
}