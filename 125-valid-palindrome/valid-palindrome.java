class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] x = s.toCharArray();
        int i = 0, j = x.length - 1;
        while(i < j){
            if(!Character.isLetterOrDigit(x[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(x[j])){
                j--;
                continue;
            }
            if(x[i]!=x[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}