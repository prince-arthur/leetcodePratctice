class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int[] countChar = new int[128];
        for(int i = 0; i < n; i++){
            countChar[s.charAt(i)]++;
        }
        int left = 0;
        int ans = n;
        int req = n / 4;
        for(int right = 0; right < n && left < n; right++){
            countChar[s.charAt(right)]--;
            while(countChar['Q'] <= req && countChar['W'] <= req && 
                countChar['E'] <= req && countChar['R'] <= req) {
                    ans = Math.min(ans, right - left + 1);
                    countChar[s.charAt(left)]++;
                    left++;
            }
        }
        return ans;
    }
}