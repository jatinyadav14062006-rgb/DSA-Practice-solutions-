class Solution {
    public int diagonalSum(int[][] mat) {
         int sum = 0;
        int matrixSize = mat.length;
      
        for (int row = 0; row < matrixSize; ++row) {
            int antiDiagonalCol = matrixSize - row - 1;

            sum += mat[row][row];
            if (row != antiDiagonalCol) {
                sum += mat[row][antiDiagonalCol];
            }
        }
      
        return sum;
    }
}