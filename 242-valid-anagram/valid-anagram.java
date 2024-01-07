class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
		char[] x = s.toCharArray(), y = t.toCharArray();
		int xLength = x.length, yLength = y.length;
		if (xLength == yLength) {
			for (int i = 0; i < xLength; i++) {
				if (map.get(x[i]) != null) {
					map.put(x[i], map.get(x[i]) + 1);
				} else {
					map.put(x[i], 1);
				}
			}

			for (int i = 0; i < yLength; i++) {
				if (map.get(y[i]) != null) {
					map.put(y[i], map.get(y[i]) - 1);
				}
			}
			
			for(int i: map.values()) {
				if(i!=0)	return false;
			}

			return true;
		} else {
			return false;
		}
    }
}