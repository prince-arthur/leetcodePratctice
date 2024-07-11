class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        char[] x = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int[] pair = new int[n];
        for(int i=0; i<n; i++) {
            if(x[i] == '(')
                stack.push(i);
            if(x[i] == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0, k=1; i<n; i+=k) {
            if(x[i] == '(' || x[i] == ')') {
                i = pair[i];
                k = -k;
            } else {
                sb.append(x[i]);
            }
        }
        return sb.toString();
    }
}