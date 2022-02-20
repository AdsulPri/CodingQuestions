class Solution {
    public int removeElement(int[] nums, int val) {
              
        //Approach matters - keep everything which is not equal to the number you want to remove
        // intiate a pointer so that you can keep on adding numbers which you want - say j starting from 0
        
        int j =0;
        
        for (int i =0; i<nums.length; i++){
        if(nums[i]!=val){
            nums[j]= nums[i];
            j++;
        }
        }
          
        
     return j;
        
    }
}
