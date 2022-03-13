//https://leetcode.com/problems/jump-game/submissions/
//https://www.youtube.com/watch?v=Zb4eRjuPHbM

class Solution {
    public boolean canJump(int[] nums) {
        
        int lastGoodPosition = nums.length - 1;
        
        //Track backwards and notice good position
        
        for (int i = nums.length - 1; i >= 0 ; i--){
            
            if(i + nums[i] >= lastGoodPosition){
                lastGoodPosition = i;
            }    
            
        }
        
        return lastGoodPosition==0;
        
    }
}
//[2, 3, 1, 1, 4]
// lastGoodPosition = index 4
// check i + nums[i] == 4 - 4+4 >=4
// lastGoodPosition = index 4

// i = 3
//lastGoodPosition = 4
// check i+nums[i] - 3+1 = 4>=lastGoodPosition
//lastGoodPosition = 3


//i = 2
// check i+nums[i] - 2+1 = 3>=lastGoodPosition(3)
//lastGoodPosition = 2

// i = 1
// check i+nums[i] - 1+3 = 3>=lastGoodPosition (2)
//lastGoodPosition = 2

//i = 0 
// check i+nums[i] - 2+1 = 3>=lastGoodPosition
//lastGoodPosition = 0


