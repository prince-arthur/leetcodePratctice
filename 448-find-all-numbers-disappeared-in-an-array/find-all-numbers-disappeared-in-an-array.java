class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] visited = new int[nums.length];
        for(int i: nums) {
            visited[i-1] = -1;
        }
        for(int i = 0; i < nums.length; i++) {
            if(visited[i]!=-1) ans.add(i+1);
        }
        return ans;
    }
}