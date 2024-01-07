class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word: strs) {
        	char[] charArr = word.toCharArray();
        	Arrays.sort(charArr);
        	String sortedWords = new String(charArr);
        	
        	if(!map.containsKey(sortedWords)) {
        		map.put(sortedWords,new ArrayList<>());
        	}
        	map.get(sortedWords).add(word);
        }
        return new ArrayList<>(map.values());
    }
}