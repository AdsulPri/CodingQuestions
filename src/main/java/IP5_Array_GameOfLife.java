//https://www.youtube.com/watch?v=x1kRrOdcOAg
//https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/831/

//https://www.geeksforgeeks.org/java-math-abs-method-examples/

//space - O(1)
//time - O(mn)


class Solution {
    public void gameOfLife(int[][] board) {
        int R = board.length;
        int C = board[0].length;
        
        //cartesian plane - 8 neighboring points at distance 1 from 0,0 - required to solve this problem
        int[] dx = {1, 1, 0, -1, -1, -1, 0,1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        
        
        for(int i=0; i<R;i++){
          for(int j=0; j<C; j++){
              
              int liveCount=0;
              
              //using distance as 1 get all adjacent neighbours - 8 as per dx dy above
              //this k loop will find out all neighbours of particular cell
              for(int k =0 ; k<8; k++){
                  //check if boudries are valid/safe
                  //take absolute number to check if the cell is live or not - as the cell which is marked for death is replaced with -1 - you will have 1 as abs value
                  if(isSafe(dx[k]+i, dy[k]+j, R, C) && Math.abs(board[dx[k]+i][dy[k]+j])==1){
                      liveCount++;
                  }
              }
              
              //replace the value to be changed to 1 to 2 - for now
              if ((liveCount == 3)&&(board[i][j] ==0)){
                  board[i][j] = 2;
              }
              
              //replace value to be replaced with 0 to -1 - for now
              if((liveCount > 3 || liveCount < 2)&&(board[i][j] == 1)){
                  board[i][j] = -1;
              }
              
              
          }  
        }
        
        for(int i=0; i<R;i++){
          for(int j=0; j<C; j++){
              board[i][j]=board[i][j]>0?1:0; //change 2 & -1 to 1 & 0
          }  
        }
    }
    
    //check boundries
    private boolean isSafe(int x, int y, int R, int C ){
        
        return (x>=0 && y>=0 && x<R && y<C);
        
    }
    
    
}
