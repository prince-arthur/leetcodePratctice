class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> circle = new ArrayList<>();
        int i = 1;
        while(i<=n){
            circle.add(i++);
        }
        int currIdx = 0;
        while(circle.size() > 1){
            int nextToRemove = (currIdx + k - 1) % circle.size();
            circle.remove(nextToRemove);
            currIdx = nextToRemove;
        }
        return circle.get(0);
    }
}