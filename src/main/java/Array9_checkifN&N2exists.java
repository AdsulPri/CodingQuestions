class Solution {
    public boolean checkIfExist(int[] arr) {
        
       //brute force  - o(n2)
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                
                if(i!=j && arr[i]== 2* arr[j])
                    return true;
                
            }
        }
        
        return false;
        
    }
}
