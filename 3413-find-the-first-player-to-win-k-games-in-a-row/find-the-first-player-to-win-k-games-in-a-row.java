class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int topPlayer = skills[0], curr = 0, ans = 0;
        for(int i=1; i<skills.length; i++){
            if(topPlayer < skills[i]){
                topPlayer = skills[i];
                curr = 0;
                ans = i;
            }
            curr++;
            if(curr== k) break;
        }
        return ans;
    }
}