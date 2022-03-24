//https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/830/

class Solution {
    public int maxArea(int[] height) {
        
        
/*/brute force = o(n2)
        int max = 0;
        
        for (int i =0 ; i < height.length; i++){
            for (int j = i+1; j< height.length ; j++){
                int min = Math.min (height[i], height[j]);
                max = Math.max(max, min * (j-i)); //important to compare max and new area
                
            }
        }
        
        return max;

    }
    
    */
    
/*optimised = o(n) - runtime 8 ms
In the optimized example, the way I thought about it was moving the smaller wall in search of a bigger wall — keeping in mind that as we slide the smaller wall closer to the other wall we need an even higher wall to maintain our existing area or exceed it

        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        
        while(i < j){
            
            int min = Math.min(height[i], height[j]);
            max = Math.max(max, min * (j-i));
            
            //Whatever is msaller moves - instead of moving everything
            if (height[i]< height[j]){
                i++;
            }else{
               j--; 
            }
            
                
        }
        
        return max;    
}
    
    */
        
   //     More optimised  - runtime 2ms
        
        int start = 0;
        int end = height.length-1;
        int ret = 0;
        while(start<end){
            if (height[start]>height[end]){
                //calculate max area by multiplying with lower wall
                //width = difference between indices start and end
                //height = height of lower wall
                ret = Math.max(ret, (end-start)*height[end]); // height[end] - lower wall
                end--;
                // move to find out any higher wall after the end
            } else {
                ret = Math.max(ret, (end-start)*height[start]); //height[start] - lower wall 
                start++;
                //move to find out out any higher wall after start
            }
        }
        return ret;
    }
}
