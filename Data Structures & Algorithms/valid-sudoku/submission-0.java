class Solution {
    public boolean isSafe(char[][] board, int r, int c){
        for(int i=0; i<9; i++){
            if(i != r && board[i][c] == board[r][c]){
                return false;
            }

            if(i != c && board[r][i] == board[r][c]){
                return false;
            }
        }

        int nr = (r/3)*3;
        int nc = (c/3)*3;
        for(int i=nr; i<nr+3; i++){
            for(int j=nc; j<nc+3; j++){
                if((i != r || j != c) && (board[i][j] == board[r][c])){
                    return false;
                }
            }
        }
        
        return true;
    }

    public boolean ishelper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }

        int nrow = 0, ncol = 0;
        if(col != board[0].length-1){
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '.'){
            if(isSafe(board, row, col)){
                return ishelper(board, nrow, ncol);
            } else {
                return false;
            }
        }

        return ishelper(board, nrow, ncol);
    }
    public boolean isValidSudoku(char[][] board) {
        return ishelper(board, 0, 0);
    }
}
