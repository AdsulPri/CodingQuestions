//Third most popular question
//avoid spelling mistakes and using arr instead of nums

class Solution {
    public int removeDuplicates(int[] nums) {
        
               
          // Check for edge cases.
          if (nums == null) {
              return 0;
          }
        
        int index =1; //consider first element to be always unique, it shouldn't be touched
        
        //two pointer technique : index and i
        
        for (int i=0; i< nums.length -1 ; i++){
            
            if(nums[i+1]!=nums[i]){ 
                //as this is a sorted array - increase the index only if there is a mismatch
                nums[index++]=nums[i+1]; //put the mismatched element at index and increase the index
            }
            
        }
        
        return index; 
        //index will be equal to length of the new unique array - remember it started at 1 - so need to do +1
        
    }
}
