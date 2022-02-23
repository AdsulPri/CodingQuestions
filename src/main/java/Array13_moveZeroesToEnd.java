class Solution {
    public void moveZeroes(int[] nums) {
        
        //for each loop improves efficiency
          int index=0;
        
        for(int i:nums)
        {
            if(i!=0)
                nums[index++]=i; 
        }
        
        while(index<nums.length)
        {
            nums[index++]=0;
        }
     
        
    }
    
    
    /*Explanation
       int zerindex= 0;
        
        for (int i = 0 ; i < nums.length ; i++){            
            if(nums[i] != 0){
               nums[zerindex ++] = nums[i];
            }
        }
        
          while(zerindex < nums.length){            
            nums[zerindex] = 0;
            zerindex++;
        }
        */
    
    
}
