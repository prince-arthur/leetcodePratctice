class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length(), count[] = {0,0,0}, left = 0, ans = 0;
        for(int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0) {
                count[s.charAt(left) - 'a']--;
                left++;
            }
            ans += left;
        }
        return ans;
    }
}