class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mapofvalues = new HashMap<Integer, Integer>();
        
        
        for (int i =0 ; i< nums.length; i++){
            int diff = target - nums[i];
            
            if (mapofvalues.containsKey(diff))
                return new int[] {mapofvalues.get(diff), i};
            else
                mapofvalues.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No Match");
        
        
    }
}
