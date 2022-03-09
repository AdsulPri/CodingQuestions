class Solution {
    public int search(int[] nums, int target) {
        
        if (nums == null || nums.length == 0) return -1;
        
        
        //find smallest element in the array
        int left = 0 ;
        int right = nums.length -1;
        
        while(left < right){
            int mid = left + (right -left)/2;
            if (nums[mid] > nums[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        //at this point left will give smallest number
        
        int start = left;
        left = 0;
        right = nums.length - 1;
        
        //find side on which search need sto carry out
        
        if (target >= nums[start] && target <= nums[right]){
            left = start;
        }else{
            right = start;
        }
        
        //binary search with left and right
        
        while(left <= right){
            int midpoint= left + (right - left)/2;
         //search for target   
            if(nums[midpoint] == target ){
                return midpoint;
            }else if (nums[midpoint] < target){
                left = midpoint+1;
            }else{
                right = midpoint-1;
            }
        }
        return -1;
    }
}
