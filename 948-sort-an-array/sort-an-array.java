class Solution {
    public int[] sortArray(int[] arr) {
		return mergeSort(arr, 0, arr.length);
	}

    private int[] mergeSort(int[] arr, int start, int end) {
        if(end - start < 2) return arr;
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
        return arr;
    }
	
	private int[] merge(int[] arr, int start, int mid, int end) {
        if(arr[mid - 1] <= arr[mid]) return arr;
        int left = start, right = mid, tempIdx = 0, temp[] = new int[end - start];
        while(left < mid && right < end) {
            temp[tempIdx++] = arr[left] <= arr[right] ? arr[left++] : arr[right++];
        }
        System.arraycopy(arr, left, arr, start+tempIdx, mid-left);
        System.arraycopy(temp, 0, arr, start, tempIdx);

        return arr;
    }
}