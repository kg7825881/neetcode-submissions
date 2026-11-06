class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int topr=0, botr = matrix.length - 1;
        int lefc=0, rightc = matrix[0].length - 1;

        while(topr <= botr && lefc <= rightc){
            for(int col=lefc; col<=rightc; col++){
                spiral.add(matrix[topr][col]);
            }
            topr++;

            for(int row=topr; row<=botr; row++){
                spiral.add(matrix[row][rightc]);
            }
            rightc--;

            if(topr <= botr){
                for(int col=rightc; col>=lefc; col--){
                    spiral.add(matrix[botr][col]);
                }
                botr--;
                
            }

            if(lefc <= rightc){
                for(int row=botr; row>=topr; row--){
                    spiral.add(matrix[row][lefc]);
                }
                lefc++;
            }

            
        }
        return spiral;
    }
}
