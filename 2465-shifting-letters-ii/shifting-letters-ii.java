class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int shiftArr[] = new int[n+1];

        for(int[] shift: shifts) {
            int start = shift[0], end = shift[1], drctn = shift[2];
            shiftArr[start] += (drctn > 0 ? 1: -1);
            if(end + 1 < n) {
                shiftArr[end + 1] -= (drctn > 0 ? 1 : -1);
            }
        }

        int currShift = 0;
        for(int i=0; i < n; i++) {
            currShift += shiftArr[i];
            shiftArr[i] = currShift;
        }

        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < n; ++i) {
            int netShift = (shiftArr[i] % 26 + 26) % 26;
            result.setCharAt(i, (char) ('a' + (s.charAt(i) - 'a' + netShift) % 26));
        }

        return result.toString();
    }
}