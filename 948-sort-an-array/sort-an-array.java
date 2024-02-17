class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length);
    }

    private int[] mergeSort(int[] arr, int start, int end){
        if(end - start < 2) return arr;
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);

        return arr;
    }

    private int[] merge(int[] arr, int start, int mid, int end){
        if(arr[mid - 1] <= arr[mid]) return arr;
        int i = start, j = mid, tempIndex = 0,
        temp[] = new int[end - start];
        while(i<mid && j<end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, arr, start, tempIndex);

        return arr;
    }
}