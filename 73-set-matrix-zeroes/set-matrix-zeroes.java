class Solution {
    public void setZeroes(int[][] matrix) {
        setZeroes(matrix, matrix.length, matrix[0].length);
    }

    private void setZeroes(int[][] matrix, int n, int m) {
        boolean firstRow = false;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) 
                if(0 == matrix[i][j]){
                    matrix[0][j] = 0;
                    if(0 == i) firstRow = true;
                    else matrix[i][0] = 0;
                }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++) {
                if(0 == matrix[i][0]|| 0 == matrix[0][j])
                    matrix[i][j] = 0;
            }
        }
        if(0 == matrix[0][0])
            for(int i = 0; i < n; i++)
                matrix[i][0] = 0;
        if(firstRow)
            for(int j = 0; j < m; j++)
                matrix[0][j] = 0;
    }
}