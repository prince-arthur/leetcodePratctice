class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] workers) {
        int maxWorker = 0;
        for (int i = 0 ; i < workers.length ; i++) {
           maxWorker = Math.max(workers[i], maxWorker); 
        }
        int maxDifficulty = 0;
        for (int j = 0 ; j < difficulty.length ; j++) {
           maxDifficulty = Math.max(difficulty[j], maxDifficulty); 
        }
        int maxCache = Math.max(maxWorker, maxDifficulty) ;
        int[] cache = new int[maxCache + 1];
        for (int i = 0 ; i < difficulty.length ; i++) {
            cache[difficulty[i]] = Math.max(cache[difficulty[i]], profit[i]);
        }
        
        for (int i = 1 ; i < cache.length ; i++) {
            cache[i] = Math.max(cache[i], cache[i-1]);
        }
        
        int maxProfit = 0;
        for (int work: workers) {
            maxProfit += cache[work];
        }
        return maxProfit;
    }
}