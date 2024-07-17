class Solution {

    static boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return true;
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
         int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return false;
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart <= rEnd) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return true;
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid+1;
            } else {
                rEnd = mid-1;
            }
        }

         // At this point, rStart is just above the potential row
         int potentialRow = rStart; 

         // Correctly handle boundary cases by ensuring the row index is valid
         if (potentialRow < rows) {
             boolean result = binarySearch(matrix, potentialRow, 0, cols - 1, target);
             if(result) {
                 return true;
             }
         }
 
         // If potentialRow was the last row or the row above it didn't contain the target,
         // Check if the row before it exists and search there.
         if (potentialRow > 0) { 
             return binarySearch(matrix, potentialRow - 1, 0, cols - 1, target);
         }
 
         return false; // Target not found
    }
}