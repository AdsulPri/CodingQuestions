class Solution {
    public int[] sortedSquares(int[] nums) {
        //initialise array with length
        int[] numsSquare =new int[nums.length];
        
        for(int i=0; i<nums.length;i++){
            numsSquare[i]=nums[i]*nums[i];
        }
        
        //Arrays.sort method have no return type
        //Sub array sort - Arrays.sort(arr, startindex, endindex);
        Arrays.sort(numsSquare);
        
        return numsSquare;
        
    }
}
