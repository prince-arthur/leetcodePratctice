class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n =  nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n - 3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n - 2; j++){
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                long newTarget = (long) target - (long) nums[i] - (long) nums[j]; 
                int low = j+1, high = n-1;
                while(low < high){
                    if(nums[low] + nums[high] == newTarget){
                        res.add(Arrays.asList(nums[low] , nums[high] , nums[i] , nums[j]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[low-1]) high--;
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] < newTarget){
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return res;
    }
}