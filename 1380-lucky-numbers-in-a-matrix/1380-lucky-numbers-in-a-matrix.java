class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int [] minInRows = new int [numRows];
        int [] maxInCols = new int [numCols];
        Arrays.fill(minInRows, 1<<30);

        for( int row = 0; row < numRows; row++){
            for( int col = 0; col < numCols; col++){
                minInRows[row] = Math.min(minInRows[row] , matrix[row][col]);
                maxInCols[col] = Math.max(maxInCols[col] , matrix[row][col]);
            }
        }
        List <Integer> luckyNumbers = new ArrayList<> ();
        for ( int row = 0; row< numRows; row++){
            for( int col = 0; col< numCols; col++){
                if(minInRows[row] == maxInCols[col]){
                    luckyNumbers.add(minInRows[row]);
                }
            }
        }
        return luckyNumbers;
    }
}