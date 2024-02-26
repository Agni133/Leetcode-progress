class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
    
            int m = matrix.length;
        int n = matrix[0].length;

        // Create a deep copy of the matrix
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            answer[i] = Arrays.copyOf(matrix[i], n);
        }

        // Iterate through each column
        for (int j = 0; j < n; j++) {
            int maxVal = -1;

            // Find the maximum value in the current column
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                }
            }

            // Replace all occurrences of -1 in the current column with the maximum value
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == -1) {
                    answer[i][j] = maxVal;
                }
            }
        }

        return answer;

    }
}