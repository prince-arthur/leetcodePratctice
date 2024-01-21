class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> totalRows = new ArrayList<List<Integer>>(); 
		List<Integer> rows = new ArrayList<>();
		
		for(int i=0; i<=rowIndex; i++) {
			rows.add(0,1);
			for(int j=1;j<rows.size()-1;j++) {
				rows.set(j, rows.get(j)+rows.get(j+1));
			}
			totalRows.add(new ArrayList<>(rows));
		}
		
		return totalRows.get(rowIndex);
    }
}