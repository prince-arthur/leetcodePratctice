class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int[] row:accounts){
            int sum=0;
            for(int col:row){
                sum+=col;
            }
            if(sum>max) max=sum;
        }
        return max;
    }
}