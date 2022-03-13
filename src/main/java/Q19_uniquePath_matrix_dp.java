class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];
        
        //fill in value as 1 for all right cellss - 1st row
        for (int i =0 ; i < dp.length; i++){
            dp[i][0] = 1;
        }
        
        //fill in values as 1 for all down cells - 1st column
        for (int j = 0 ; j < dp[0].length; j++){
            dp[0][j] =1;
        }
        
        //add ways from previous positions to fill in remaining values  - ROW wise
        
         for (int i =1 ; i < dp.length; i++){
          for (int j =1 ; j < dp[i].length; j++){
              
              dp[i][j] = dp[i-1][j] + dp[i][j-1]; //Important
              
          }
         }
        
        
        return dp[m-1][n-1]; //return last finish cell  
        
        
    }
}
