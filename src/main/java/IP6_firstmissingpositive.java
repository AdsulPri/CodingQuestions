//https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/832/
//https://www.youtube.com/watch?v=9SnkdYXNIzM

//O(3n)  = O(n)
//O(1)


class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length ==0) return 1;
        
        int n = nums.length;
        int countOnes = 0;
        
       // Step 1: Replace negatives, zeroes and values greater than n to 1(smallest pos int)
        
        for (int i=0; i< n ; i++){
            if(nums[i]==1){
                countOnes++;
            }else if(nums[i]<=0 || nums[i] > n){
                nums[i] = 1;
            }
        }
        
        if(countOnes==0) return 1;
        
        //step 2: Replace the indices which are present with negative numbers
        for (int i=0; i< n ; i++){
            
            int index = Math.abs(nums[i]) - 1;  //get zero based index for each element
            
            if(nums[index] > 0) {    //important condition     - skips already traversed indices         
                nums[index] = -1 * nums[index];
            }
        }
        
        //Step 3: Find first non-negative index and add 1 to it and return
        for (int i=0; i< n ; i++){
           if(nums[i]>0)
                return i+1;
        }
        
        return n+1;
    }
}
