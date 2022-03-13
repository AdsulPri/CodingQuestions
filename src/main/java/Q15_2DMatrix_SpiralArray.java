//https://www.youtube.com/watch?v=3joo9yAZVh8
//https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
       List<Integer> res = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0)
            return res;
            
        //matrix [ROW][COL]
        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cStart = 0;
        int cEnd = matrix[0].length - 1;
        
        
        while(cStart <= cEnd && rStart <= rEnd ){
            
            // forward row RIGHT
            
            for (int i = cStart; i<= cEnd ; i++){
                res.add(matrix[rStart][i]);
            }
            
            rStart++;
            
            // downward column DOWN
            
            for (int i = rStart; i<= rEnd ; i++){
                res.add(matrix[i][cEnd]);
            }
            
            cEnd--;
            
            // backward row LEFT
             
            if( rStart <= rEnd){ //Important condition
                for (int i = cEnd; i>= cStart ; i--){
                res.add(matrix[rEnd][i]);
            }
            }
            
            rEnd-- ;
            
            
            // upward column UP
           if(cStart <=cEnd){ //Important condition
                for (int i = rEnd; i>= rStart ; i--){
                res.add(matrix[i][cStart]);
             }
            }
            
            cStart++;  
        }
        return res;
        
        
    }
}
