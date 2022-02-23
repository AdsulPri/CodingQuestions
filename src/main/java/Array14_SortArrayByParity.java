//Parity is dividing odds and evens
//Very popular question

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        //popular question
        
        
        int index=0;
        
        for (int i=0; i< nums.length; i++){
            
            if(nums[i]%2 ==0){//swap to not loose the index
                
                int temp = nums[index];
                nums[index++] = nums[i]; //index++ is important
                nums[i]= temp;
                
            }
        }
        return nums; //return the array
    }
}
