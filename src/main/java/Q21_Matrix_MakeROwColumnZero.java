//https://www.youtube.com/watch?v=djt9mwch-Xo
//https://leetcode.com/problems/set-matrix-zeroes/submissions/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length; //important in case of asymmetric array
        
        int x = 1 ;
        int y = 1;
 
        //check first row - iternate with "n"
        for (int j= 0 ; j< n ; j++){
            if(matrix[0][j]==0) 
                x=0; //update row pointer
        }
        
        //check first column - iterate with "m"
        for (int i= 0 ; i< m ; i++){
            if(matrix[i][0]==0) 
                y=0; //update column pointer
        }
        
        //check innner matrix 1,1
          for (int i= 1 ; i < m ; i++){
              for (int j= 1 ; j < n; j++){
                  if(matrix[i][j] == 0){
                      matrix[i][0] = 0;
                      matrix[0][j] = 0;
                  }
              }  
          }
        
        
        //make rows zeros in innner matrix
        for (int j = 1 ; j< n ; j++){
            if(matrix[0][j]==0){
               for (int i=1; i<m; i++){
                   matrix[i][j] =0;
               } 
            }
            
        }
        
        //make columns zero in inner matrix
           for (int i=1; i<m; i++){
            if(matrix[i][0]==0){
            for (int j = 1 ; j< n ; j++){
                   matrix[i][j] =0;
               } 
            }
            
            }
        
        // if x is zero make first row zero
        //iterating over only one row - no need of two for loops
              if(x == 0){
                    for (int j = 0 ; j < n ; j++){ //iterate on n to update row
                        matrix[0][j] = 0;
                    }
              }
        
        
        // if y is zero make first column zero
        //iterating over only one row - no need of two for loops
              if(y == 0){
                    for (int i = 0 ; i< m ; i++){//iterate on m to update column
                        matrix[i][0] = 0;
                    }
              }
      
        
    }
 
}
