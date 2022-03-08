class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> output = new LinkedList(); //linkedlist decalaration
        
        for (int i=0; i< nums.length -2 ; i++){
            
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                
                int high = nums.length -1; // last element
                int low = i+1; //index of the next element
                int sum = 0 - nums[i]; // total sum needs to be zero
                
                while(low<high){
                    
                    if(nums[low] + nums[high] == sum){
                        
                        output.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] ==  nums[low+1]) low++; 
                        // if the nearing elements are same then skip them - increase the low
                        while(low<high && nums[high] ==  nums [high - 1]) high--;
                        // if the nearing elements are same then skip them  - decrease the high                     
                        low++;
                        high--;                        
                    }else if (nums[low] + nums[high] > sum){
                        high --;
                    }else{
                        low++;
                    }   
                }   
            }   
        }
        
        return output;
    }
}
