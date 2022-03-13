class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        
        dp[0] = 1; //not climb
        dp[1] = 1; //climb
        
        for (int i =2 ; i <= n ; i++){ //go till <=n start with 2
            dp[i] = dp[i-1] +dp[i-2]; //sum of subways leading to destination
        }
        
        return dp[n];
        
    }
}
