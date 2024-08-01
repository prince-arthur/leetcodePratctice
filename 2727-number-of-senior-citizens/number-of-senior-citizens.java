class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s: details){
            String age = s.substring(s.length()-4, s.length()-2);
            if(Integer.parseInt(age) > 60) count++;
        }
        return count;
    }
}