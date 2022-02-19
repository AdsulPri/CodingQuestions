class Solution {
    public void duplicateZeros(int[] arr) {
        
        int orgLength = arr.length;
        
        int count = 0;
   
        
        for (int i=0; i< orgLength ; i++){
            if(arr[i]==0){
                count++;            
            }
        }
       
    /*Method 1
        int i = orgLength -1 ; 
        int j = orgLength -1 +count;
        
        
       while(i!=j){
           
           insert (arr, i, j--);
               if(arr[i]==0){
                   insert (arr, i, j--);
                  //while passing an array to a function just pass thename of the array without []
               }
           
           i--;
       }
      */
        
    //Method 2
        
        int totalIndex = count + arr.length;
        int resIndex = arr.length;
        for (int i = arr.length - 1, j = totalIndex - 1; i < j; i--, j--) {
            if (arr[i] != 0) {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            } else {
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            }
        }
    }
           
    
    private void insert(int[] arr, int i , int j){
        if (j< arr.length){
            arr[j]=arr[i]; //write i th element at j th index 
        }
    }
        
 //https://www.youtube.com/watch?v=io3N5YTFbxM
    
    
    
}
