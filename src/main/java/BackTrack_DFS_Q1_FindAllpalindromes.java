class Solution {
    //https://www.youtube.com/watch?v=uJeS6FmbSjM
    //Time complexity - O(n*2^n)
    //Space complexity - O(n) because of DFS
    
    //Define class level result list
    List<List<String>> result = new ArrayList<>();
    
    //find if the string is palindrome
    private boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;        
    }
    
    //Implement DFS for the given start - and return thosenodes with valid palindormes
    
    //dfs always have return type as void - doing in place operation for class list result
    private void dfs(String s, int start, List<String> list){ 
        //Hanlde base case
        if (start == s.length()){ //best case - aab and reached aab
            result.add(new ArrayList<>(list)); // add to result and done
            return;
        }
        
        //remaining cases
        for(int i=start; i<s.length(); i++){ //SCOPE - always start from given start not from 0 **IMP**
            //remember to calculate palindorme always from start
            if(isPalindrome(s, start, i)){ //CONSTRAINT is satisfied
                list.add(s.substring(start, i+1 )); //refer start and i+1  - for substring
                dfs(s, i+1, list); //RECURSSION - with i+1
                list.remove(list.size()-1); //BACKTRACK - be referring to list.size()
            }
        }
    }
    
    //call DFS and return list of valid palindormes
    public List<List<String>> partition(String s) {
        
        dfs(s, 0, new ArrayList<>()); // given string, starting index, new list to iterate at each iteration
        return result;
        
    }
}
