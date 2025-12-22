class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = (matrix.length - 1);
        int row = -1; 
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (matrix[middle][0] <= target && target <= matrix[middle][matrix[middle].length - 1]) {
                row = middle; 
                break;
            }

            else if (matrix[middle][0] < target) low = middle + 1;

            else high = middle - 1;
        }

        if(row == -1) return false;

        int left = 0;
        int right = (matrix[row].length - 1);

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (matrix[row][middle] == target) return true;

            else if (matrix[row][middle] < target) left = middle + 1;

    
            else right = middle - 1;
        }


        return false;
    }
}