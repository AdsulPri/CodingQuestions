class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missNum = new ArrayList<>();
        
        // Set<Integer> set = new HashSet<>(Arrays.asList(arr));//to add elemenets of array 
        
         HashSet<Integer> set = new HashSet<>();//to add elemenets of array 
        
        for (int i:nums){
            set.add(i);
        }
        
        for (int i=1; i <=nums.length; i++){ // start from 1 and it is inclusive so <= length
            
            if(set.contains(i)==false)
                missNum.add(i);
            
        }
        
        return missNum;
    }
}
