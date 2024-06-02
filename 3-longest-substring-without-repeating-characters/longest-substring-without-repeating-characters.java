class Solution {
    public int lengthOfLongestSubstring(String s) {   
        char[] x = s.toCharArray();
        int left=0, ans=0;
        Set<Character> set = new HashSet<>();
        for(int right=0; right<x.length; right++){
            while(set.contains(x[right])){
                set.remove(x[left]);
                left++;
            }
            set.add(x[right]);
            ans = Math.max(ans,set.size());
        }
        return ans;
    }
}