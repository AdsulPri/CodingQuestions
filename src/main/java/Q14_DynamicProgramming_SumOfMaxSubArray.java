//https://www.youtube.com/watch?v=tmakGVOGV3A//
//https://leetcode.com/problems/maximum-subarray/

class Solution {
    
    public int maxSubArray(int[] nums) {
        int max = nums[0];
                
        //Dynamic programming
        for(int i = 1; i< nums.length; i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]); 
            //compare current element and sum of last+current
            max = Math.max(nums[i], max); // compare with current max 
        }
        
        return max;
    }
}
//O(N)
//O(1)
