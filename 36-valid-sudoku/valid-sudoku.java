class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet<>();
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++) {
                char number = board[row][col];
                if('.'!=number ){
                    if(!set.add(number + "in row " + row) || !set.add(number + "in col " + col) || !set.add(number + " in block " + row/3 + "-" + col/3))
                        return false;
                }
            }
        }
        return true;
    }
}