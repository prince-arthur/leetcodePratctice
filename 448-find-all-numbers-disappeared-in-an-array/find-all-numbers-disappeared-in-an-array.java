class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i: nums){
            set.add(i);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}