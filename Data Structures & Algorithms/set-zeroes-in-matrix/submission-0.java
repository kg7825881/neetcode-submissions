class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    for(int k=0; k<row; k++){
                        result[k][j] = 0;
                    }
                    for(int k=0; k<col; k++){
                        result[i][k] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(result[i][j] == 0){
                    matrix[i][j] = result[i][j];
                }
            }
        }
    }
}
