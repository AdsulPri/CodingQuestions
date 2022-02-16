//Array problem 2

class Solution {
    public int findNumbers(int[] nums) {
        
        int count =0;
        
       /* for (int i=0;i< nums.length; i++){
            
            //using math log to the base 10 function
           int length = (int) (Math. log10(nums[i]) + 1);
            
            //using string 
            //String str=String.valueOf(nums[i]);
            //int  length =str.length();
            
            if(length%2==0)
                count++;
            else
                count=count;
        }*/
       
        
        //For each loop - no need to write nums[i]
        for (int i:nums){
            //using string 
            String str=String.valueOf(i);
            int  length =str.length();
            
            if(length%2==0)
                count++;
            else
                count=count;
        }
        
        return count;
        
    }
}
