//https://www.youtube.com/watch?v=K7B9ZTKoRpQ
//https://leetcode.com/problems/insert-interval/

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

    List<int[]> result = new ArrayList<>();
   
        //use case fo multiple whiles IMP
        
        int i=0;
        int N=intervals.length;
        
        //Non-overlapping
        while(i < N &&  intervals[i][1] < newInterval[0] ){ //last of current is less than start of new - no overlap
                    result.add(intervals[i++]);
            
       } 
        
        //Overlapping

      while ( i < N && intervals[i][0] <= newInterval[1] ){ //first of current is less or equal to last of new - yes overlap
              
         newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
          newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
         i++;
    }
             result.add(newInterval);
        
        //Remaining  
        
            while(i < N ){
              result.add(intervals[i++]); 
            }
                
         

    return result.toArray(new int[result.size()-1][]);
} 
}
    
