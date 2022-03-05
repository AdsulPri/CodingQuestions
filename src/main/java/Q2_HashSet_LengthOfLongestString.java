class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i =0 ;
        
        int j = 0;
        
        int max =0 ;
        
        HashSet<Character> set = new HashSet(); //HashSet definition H and S capital
        
        
        while (j < s.length()){
            
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max (set.size(), max);   // comapre existing max and new max   
                 
            }else{
                
                set.remove(s.charAt(i));// move slow pointer -to consider all combinations
                i++;
            }
            
            
        }
        return max; //return max
        
    }
}
