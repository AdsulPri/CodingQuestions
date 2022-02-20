class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
   
      int p1=m-1, p2=n-1, i=m+n-1;
        
        //Two pointer approach is efficient
        //In place merge - dont create new array
        // the questions has given array1 such that it can have all elements of merged array
        
        //defining and using i with WHILE loop is important 
        
        while(p2>=0){
            
            //odd case
            if(p1>=0 && nums1[p1]>nums2[p2]){                    
                nums1[i--]=nums1[p1--];
            }
            //usual case i.e num2[p2] > num1[p1]
            else{
                nums1[i--]=nums2[p2--];
            }
            
        }
       
       //https://www.youtube.com/watch?v=C4oBXLr3zos 
  
    }
}
