class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return spiralOrder(matrix, matrix.length, matrix[0].length);
    }

    private List<Integer> spiralOrder(int[][] matrix, int n, int m){
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return list;

        int top = 0, bot = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while(true) {
            for(int i = left; i<= right; i++) list.add(matrix[top][i]);
            top++;
            if(left > right || top > bot) break;

            for(int i = top; i<= bot; i++) list.add(matrix[i][right]);
            right--;
            if(left > right || top > bot) break;

            for(int i = right; i>= left; i--) list.add(matrix[bot][i]);
            bot--;
            if(left > right || top > bot) break;

            for(int i = bot; i>= top; i--) list.add(matrix[i][left]);
            left++;
            if(left > right || top > bot) break;
        }
        return list;
    }
}