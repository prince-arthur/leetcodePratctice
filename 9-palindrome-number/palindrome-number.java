class Solution {
    public boolean isPalindrome(int num) {
        if(num<0) return false;
        int n = num, digit = 0, ans = 0;
        while(n>0) {
            digit = n%10;
            ans = ans*10 + digit;
            n/=10;
        }
        return ans == num;
    }
}