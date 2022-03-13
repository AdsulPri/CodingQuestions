//https://www.youtube.com/watch?v=SA867FvqHrM
//https://leetcode.com/problems/rotate-image/submissions/

class Solution {
    public void rotate(int[][] matrix) {
        
        int N = matrix.length;
        
        //transpose - diagonal remains same
        for (int i =0 ; i < N; i++){
            for (int j = i ; j< N ; j++){ //j starts with i
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        
        //flip - first column with last column 
        for (int i =0 ; i < N; i++){
            for (int j = 0 ; j< N/2 ; j++){ //goes till only N/2
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j]; //from last element N-1-j
                matrix[i][N-1-j] = temp;                
            }
        }
    }
}
