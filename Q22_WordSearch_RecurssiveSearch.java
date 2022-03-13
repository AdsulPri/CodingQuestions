//https://www.youtube.com/watch?v=m9TrOL1ETxI
//https://leetcode.com/problems/word-search/

class Solution {
    
    //create boolean array
    boolean[][] visited;
    
    public boolean exist(char[][] board, String word) {
     int m = board.length;
     int n = board[0].length;
     // int index = 0;
        
     //initialize it   
     visited    = new boolean[m][n];
        
    //iterate through matrix and search for word whenevr the character matches first character of given string
    for (int i = 0 ; i< m ; i++){
        for (int j = 0 ; j< n ; j++){
            if(word.charAt(0) == board[i][j]  && search(i, j , 0, word, board)){
                return true;
            }
        }
    }    
        return false;
        
    }
    
    //Search method
    public boolean search(int i, int j , int index, String word, char[][] board){
        //BASE Condition  - 
        //if index reaches last of word - we found the word
        if (index == word.length()){
            return true;
        }
        /*
        Boundry conditions
        1. j is less than 0
        2. j is greater than m
        3. i is less than 0
        4. i is greater than n
        
        5. char at index is not equal to [i][j]
        6. visited is true - already visited
        
        */
        if(i < 0 || i>= board.length || j < 0 ||  j >= board[0].length || word.charAt(index) != board[i][j] || visited[i][j]){
            return false;
        }
        
        //ADD
        visited[i][j] = true;  
        
        //RECURSSION
        //check up down left and right recursively - while iterating over the word i.e. with index+1
        if( search(i+1, j, index+1, word, board ) ||
           search(i-1, j , index+1, word, board) ||
           search(i, j+1, index+1, word, board) ||
           search (i, j-1, index+1, word, board)     
        )
            return true;
        
        
        //REMOVE the [i][j] from visted if word or letter is not found 
        visited[i][j] = false;  
        
        return false;      
    }
}
