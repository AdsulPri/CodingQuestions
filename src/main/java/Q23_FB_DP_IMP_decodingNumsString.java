//https://www.youtube.com/watch?v=cQX3yHS0cLo
//https://leetcode.com/problems/decode-ways/ >> Medium

class Solution {
    public int numDecodings(String s) {
       
        int[] dp = new int[s.length()+1];
        
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0'? 0 : 1; //if first character is not zero then there will be a way otherwise no way
        
        //Can deal with only two digits as have mapping till only 26
        for (int i = 2 ; i <= s.length() ; i++){ //consider last element of string with <=
            int oneDigit = Integer.valueOf(s.substring(i-1, i)); // one element - from i till i-1
            int twoDigits = Integer.valueOf(s.substring(i-2, i)); //two elements - from i till i - 2
            
            if(oneDigit > 0 ){ 
                dp[i] += dp[i-1];
            }
            
            if(twoDigits >= 10 && twoDigits <= 26){
                dp[i] += dp[i-2];
            }
            
        }
        
        return dp[s.length()];
    }
}
