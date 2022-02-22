class Solution {
    public int[] replaceElements(int[] arr) {
        
        int greatest=-1;
        
        for (int i = arr.length -1 ; i>=0; i--){ //start from end, dont forget to put >= 0 
           int temp = arr[i];
            
            arr[i] = greatest; //replace last element by -1 : as greatest to right of last is -1. The greatest values will be replaced from below ifs.
            
            if(temp>greatest){
                greatest = temp; //replace greatest as you move left
                
            }
            
        }
        
        return arr;
       // https://www.youtube.com/watch?v=CgtlhEZS4lA
    }
}
