//https://www.youtube.com/watch?v=ptgykfAEax8
//https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedanagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String current: strs){
            //Create character array
            char[] characters = current.toCharArray();
            //sort
            Arrays.sort(characters);
            //create new string
            String sorted = new String(characters); // OR String.valueOf(characters)
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>()); //add empty list as value
            }
            
            map.get(sorted).add(current);   // add the current - i.e. without sort list to map
        }
        
        groupedanagrams.addAll(map.values()); // IMP method to add all values from map 
        
        return groupedanagrams; // OR new ArrayLst<>(map.values())
        
    }
}
