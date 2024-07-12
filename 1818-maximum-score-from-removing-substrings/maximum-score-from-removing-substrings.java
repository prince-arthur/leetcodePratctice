class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans = 0;
        String top, bot;
        int topScore, botScore;
        if(y > x) {
            top = "ba";
            topScore = y;
            bot = "ab";
            botScore = x;
        } else {
            top = "ab";
            topScore = x;
            bot = "ba";
            botScore = y;
        }

        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c == top.charAt(1) && sb.length() > 0 && sb.charAt(sb.length()-1) == top.charAt(0)) {
                ans += topScore;
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        StringBuilder newSb = new StringBuilder();
        for(char c: sb.toString().toCharArray()) {
            if(c == bot.charAt(1) && newSb.length() > 0 && newSb.charAt(newSb.length() - 1) == bot.charAt(0)) {
                ans += botScore;
                newSb.setLength(newSb.length() - 1);
            } else {
                newSb.append(c);
            }
        }
        return ans;
    }
}