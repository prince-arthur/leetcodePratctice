class Solution {
    public boolean isPalindrome(String s) {
        char[] x = s.toCharArray();
		int i=0, j=s.length()-1;
		while(i<j) {
			char start = x[i], end = x[j];
			if(!Character.isLetterOrDigit(start)) {
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(end)) {
				j--;
				continue;
			} 
			if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
				return false;
			}
			
			i++;
			j--;
		}
		return true;
    }
}