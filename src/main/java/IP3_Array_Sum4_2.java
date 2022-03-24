//https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/829/
//https://www.geeksforgeeks.org/hashmap-getordefaultkey-defaultvalue-method-in-java-with-examples/

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        int result = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n1: nums1){
            for(int n2: nums2){
                
                map.put(n1+n2, map.getOrDefault(n1+n2, 0)+1); //+1 for counter
                
            }
        }
        
         for (int n3: nums3){
            for(int n4: nums4){
                
               result += map.getOrDefault(-(n3+n4), 0); //negation
                
            }
        }
        
        return result;
    }
}
