class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) return mat;
        int[][] result = new int[r][c];
        int rowInd = 0;
        int colInd = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[rowInd][colInd] = mat[i][j];
                colInd++;

                if (colInd == c) {
                    colInd = 0;
                    rowInd++;
                }
            }
        }
        return result;
    }
}