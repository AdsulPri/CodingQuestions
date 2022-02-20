class Solution {
    public int removeDuplicates(int[] nums) {
        
        //two pointers - complexity O (2 * n) i.e. O(n) - the array is traversed only once by each pointer
        int i =0;//slow pointer
        
        for (int j =1; j< nums.length; j++){// iterate on fast pointer - with slow pointer chances of going out of bound
            
            if(nums[i]!=nums[j]){ // if fast pointer is not equal to slow pointer
                
                nums[++i]=nums[j]; // then increase slow pointer and assign value of fast pointer to the increased index
                
            }
            
            
        }
        
        return i+1; //index +1 - length
        
    }
}
