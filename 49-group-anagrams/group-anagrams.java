class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] x = s.toCharArray();
            Arrays.sort(x);
            String sortedX = new String(x);
            if(!map.containsKey(sortedX)){
                map.put(sortedX, new ArrayList<>());
            }
            map.get(sortedX).add(s);
        }
        return new ArrayList<>(map.values());
    }
}