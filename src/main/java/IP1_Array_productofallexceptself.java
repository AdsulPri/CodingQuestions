//https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/827/
//https://www.youtube.com/watch?v=tSRFtR3pv74

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int N = nums.length;
        
        int[] right_prod = new int[N];
        int[] left_prod = new int[N];
        
        int[] output_arr = new int[N];
        
        left_prod[0] = 1;
        right_prod[N-1] = 1;
        
        //take product from left to right
        
        for (int i = 1; i< N ; i++){
            left_prod[i] = left_prod[i-1]*nums[i-1];
        }
        
        //take product from right to left
        
        for (int i = N-2; i >= 0 ; i--){
            right_prod[i] = right_prod[i+1]*nums[i+1];
        }
        
        //combine both for answer
        
        for(int i=0; i< N ; i++){
           output_arr[i] =  left_prod[i]*right_prod[i];
        }
        
        return output_arr;
    }
}
