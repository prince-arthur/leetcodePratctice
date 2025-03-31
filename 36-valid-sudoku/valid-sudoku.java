class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isValidSudoku(board, board.length);
    }

    private boolean isValidSudoku(char[][] board, int N){
        Set<Character>[] rows = new HashSet[N];
        Set<Character>[] cols = new HashSet[N];
        Set<Character>[] boxs = new HashSet[N];

        for(int i = 0; i < N; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxs[i] = new HashSet<>();
        }

        for(int r = 0; r < N; r++) {
            for(int c = 0; c < N; c++) {
                char val = board[r][c];

                if(val == '.') {
                    continue;
                }

                if(rows[r].contains(val)) return false;
                rows[r].add(val);
                if(cols[c].contains(val)) return false;
                cols[c].add(val);
                
                int idx = r/3*3 + c/3;
                if(boxs[idx].contains(val)) return false;
                boxs[idx].add(val);
            }
        }
        return true;
    }
}