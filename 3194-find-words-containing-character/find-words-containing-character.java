class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i < n; i++) {
            for(char c: words[i].toCharArray()) {
                if(c == x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}