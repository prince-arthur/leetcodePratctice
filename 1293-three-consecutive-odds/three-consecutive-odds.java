class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 1; i < arr.length - 1; i++) {
            if(isOdd(arr[i-1]) && isOdd(arr[i]) && isOdd(arr[i+1])) return true;
        }
        return false;
    }

    private boolean isOdd(int n){
        return (n & 1) != 0;
    }
}