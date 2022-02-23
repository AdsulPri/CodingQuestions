class Solution {
    public int heightChecker(int[] heights) {
        
        int[] sortedArray = heights.clone(); //necessary to maintain another copy
        
        Arrays.sort(sortedArray); //and to sort it
        
        int count=0;
        
        for (int i =0 ; i< heights.length; i++){
            
            if(sortedArray[i]!= heights[i]){ //compare expected and actual
                
                count++;
            }
        }
        
        return count;
        
    }
}
