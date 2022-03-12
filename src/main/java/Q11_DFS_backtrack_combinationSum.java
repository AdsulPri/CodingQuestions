//https://www.youtube.com/watch?v=vftmHwRVQW4
//https://leetcode.com/problems/combination-sum/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        if(candidates.length == 0) return null;
        
        List<List<Integer>> result = new ArrayList<>();
        
        findCombinations(candidates, 0, target, new ArrayList<>(), result);
        // given array, start, end condition, empty list, result list
        
        return result;
        
    }
    
    
    private void findCombinations(int[] arr, int start, int sum, List<Integer> current, List<List<Integer>> result){
        
        //base conditions
        if(sum == 0){
            result.add ( new ArrayList<> (current));
            return;
        }
        
        for(int i = start; i< arr.length; i++){
            
            if(arr[i] <= sum){ //CONSTRAINT
                
                current.add(arr[i]);   
                // ADD element            
                
                findCombinations(arr, i, sum - arr[i], current, result); 
                //RECURSION with i and not i+1 - change based on constraint
                
                current.remove(new Integer(arr[i])); 
                // BACKTRACK - very important remove the array element and not size() -1       
            }
            
        }
        
    }
    
}
