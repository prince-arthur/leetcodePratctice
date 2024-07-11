class Solution {
    public double averageWaitingTime(int[][] customers) {
        double wait = 0, curr = 0;
        for (int[] a: customers) {
            curr = Math.max(curr, 1.0 * a[0]) + a[1];
            wait += curr - a[0];
        }
        return 1.0 * wait / customers.length;
    }
}