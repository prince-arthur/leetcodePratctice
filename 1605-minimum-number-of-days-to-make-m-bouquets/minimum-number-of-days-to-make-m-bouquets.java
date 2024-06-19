class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0;
        int end = 0;
        for(int i: bloomDay) {
            end = Math.max(i, end);
        }
        int minNoOfDays = -1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(getMinBouquetOnDay(bloomDay, mid, k) >= m) {
                minNoOfDays = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minNoOfDays;
    }

    private int getMinBouquetOnDay(int[] bloomDay, int mid, int k) {
        int noOfBouquet = 0;
        int count = 0;
        for(int i=0; i<bloomDay.length; i++) {
            if(bloomDay[i] <= mid) {
                count++;
            } else {
                count = 0;
            }
            if(count == k){
                noOfBouquet++;
                count=0;
            }
        }
        return noOfBouquet;
    }
}