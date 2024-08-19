class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int minDays = -1, left = 0, right = Arrays.stream(bloomDay).max().getAsInt();
        while(left <= right) {
            int mid = left + (right - left)/2;
            int bouquetFormed = getBouquets(bloomDay, mid, k);
            if(bouquetFormed >= m){
                minDays = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minDays;
    }

    private int getBouquets(int[] arr, int mid, int k) {
        int count = 0, numOfBq = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= mid) {
                count++;
            } else {
                count = 0;
            }
            if(count == k) {
                numOfBq++;
                count = 0;
            }
        }
        return numOfBq;
    }
}