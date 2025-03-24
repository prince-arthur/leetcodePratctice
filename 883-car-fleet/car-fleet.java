class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
		// Stack<Double> stack = new Stack<>();
		// for (int i = position.length-1; i >=0; i--) {
		// 	stack.add((double)(target-position[i])/speed[i]);
		// 	if(stack.size()>=2 && stack.elementAt(stack.size()-1)<=stack.elementAt(stack.size()-2))
		// 		stack.pop();
		// }
		// return stack.size();
        int res = 0;
        double[] timeArr = new double[target];
        for(int i=0; i<position.length; i++) {
            timeArr[position[i]] = (double)(target - position[i])/speed[i];
        }
        double prev = 0.0;
        for(int i = target - 1; i>=0; i--) {
            double curr = timeArr[i];
            if(curr > prev) {
                prev = curr;
                res++;
            }
        }
        return res;
	}
}