//https://www.youtube.com/watch?v=qKczfGUrFY4
//https://leetcode.com/problems/merge-intervals/
//Medium

class Solution {
    public int[][] merge(int[][] intervals) {
        //null condition
        if(intervals.length<=1){
            return intervals;
        }
        
        //Comparative sort to sort on the basis of first element of each element
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        //define output
        List<int[]> output_arr = new ArrayList<>();
        
        //Assign first interval as current interval
        int[] currentInterval = intervals[0];
        
        //add teh first array as first interval in the output
        output_arr.add(currentInterval);
        
        for (int[] interval : intervals){
            
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            if(nextStart<=currentEnd){ // check next start and current end
                currentInterval[1] = Math.max(currentEnd, nextEnd);  //TAKE MAX out of two ENDS
                // change currentInterval[1] so that it is chnaged in the output_arr as well
            }else { //important condition to move forward
                currentInterval = interval; // assign interval to current interval
                output_arr.add(currentInterval); //add it to output
            }
        }
        
        return output_arr.toArray(new int[output_arr.size() - 1][]); // how to return a list of arrays as a two D array
    }
}
