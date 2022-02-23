class Solution {
    public int removeElement(int[] nums, int val) {
        
        
        int expected_pos=0 ;
        
        for (int i=0 ; i <nums.length; i++){
            
            if (nums[i]!=val){// if number is not equal to item to be removed
                
                nums[expected_pos] = nums[i];//move to front 
                
                expected_pos++; // increase teh pointer - at the end of this pointer there will be no val present in teh array
                
                
            }
            
            
        }
        
        return expected_pos;
        
    }
}
