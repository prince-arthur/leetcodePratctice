class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();
        for(char c:x) {
            count[c-'a']++;
        }
        for(char c:y) {
            count[c-'a']--;
        }
        for(int i: count) {
            if(i!=0) return false;
        }
        return true;
    }
}