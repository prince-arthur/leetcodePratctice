class Solution {
    public boolean isPalindrome(String s) {
        char[] x = s.toCharArray();
		int i=0, j=s.length()-1;
		while(i<j) {
			if(!Character.isLetterOrDigit(x[i])) {
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(x[j])) {
				j--;
				continue;
			} 
			if(Character.toLowerCase(x[i]) != Character.toLowerCase(x[j])) {
				return false;
			}
			
			i++;
			j--;
		}
		return true;
    }
}