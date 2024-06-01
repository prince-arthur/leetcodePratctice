class Solution {
    public int scoreOfString(String s) {
        char[] x = s.toCharArray();
        int sum = 0;
        for(int i=1; i<x.length; i++){
            sum+=Math.abs(x[i-1]-x[i]);
        }
        return sum;
    }
}