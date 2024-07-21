class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int one = Integer.MAX_VALUE, two = Integer.MAX_VALUE, 
        countOne = 0, countTwo = 0;
        for(int num: nums){
            if(countOne == 0 && num!=two){
                countOne=1;
                one = num;
            } else if(countTwo == 0 && num!=one) {
                countTwo=1;
                two = num;
            } else if(num == one){ 
                countOne++;
            } else if(num == two) { 
                countTwo++;
            } else {
                countOne--;
                countTwo--;
            }
        }
        List<Integer> list = new ArrayList<>();
        countOne= 0; 
        countTwo =0;
        for(int i :nums){
            if(i==one) countOne++;
            if(i==two) countTwo++;
        }
        // int threshold = nums.length/3;
        if(countOne > (nums.length/3)) list.add(one);
        if(countTwo > (nums.length/3)) list.add(two);
        return list;
    }
}