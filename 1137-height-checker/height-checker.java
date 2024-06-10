class Solution {
    public int heightChecker(int[] heights) {
        int[] heightFreq = new int[101];
        for(int h: heights){
            heightFreq[h]++;
        }
        int ans = 0;
        int currHeight = 0;
        for(int i=0; i<heights.length; i++) {
            while(heightFreq[currHeight] == 0) currHeight++;
            if(currHeight != heights[i]) {
                ans++;
            }
            heightFreq[currHeight]--;
        }
        return ans;
    }
}