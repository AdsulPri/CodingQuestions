class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length < 3 ) return false;
        
        int i =0;
        
        //check if it is increasing pattern
        //SEQUENCE OF CONDITIONS is important - check i and i+1 in arr.length before doing comparison
        while(i< arr.length && i+1 < arr.length && arr[i]< arr[i+1] ){
            i++;
        }
        
        // if not increasing - return false
        if(i==0 || i+1 >= arr.length){
            return false;
        }
        
        //check if there is decreasing pattern
        while(i<arr.length && i+1 < arr.length){
            if(arr[i]<=arr[i++ + 1]){//add 1 to i after comparing
                return false;} // if not decreasing that is if i+1 is greater than i then return false
        }
        
        return true; // if all above conditions satisfy it is valid mountain
        
    }
}
