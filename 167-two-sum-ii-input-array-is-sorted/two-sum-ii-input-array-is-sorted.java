class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length, i=0, j = n-1;
		while(i<j) {
			int add = numbers[i] + numbers[j];
			if(add == target) {
				return new int[] {i+1,j+1};
			} else if(add>target) {
				j--;
			} else {
				i++;
			}
			
		}
		return new int[] {-1,-1};
    }
}