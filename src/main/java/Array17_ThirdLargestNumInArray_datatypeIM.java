class Solution {
    public int thirdMax(int[] nums) {
        
   /*  Most optimised */   
    long first=Long.MIN_VALUE; //Datatypes are importanta
        long second=Long.MIN_VALUE;
    long third=Long.MIN_VALUE;

    for(int num:nums)
    {
        if(num>first)
        {
            third=second;
            second=first;
            first=num;
        }
        else if(num==first)
        {
            continue;
            
        }
        else if(num>second)
        {
            third=second;
            second=num;
            
        }
        else if(num==second)
        {
            continue;
        }
        else if(num>third)
        {
            third=num;
            
        }
    }
    
    
    return third==Long.MIN_VALUE?(int)first:(int)third; // observe tertiary
 }
    /* Another approach
        Integer max=null;//initialise with null
        Integer second_max =null;
        Integer third_max =null;
        
        for (Integer num:nums)
        {
            
            if(num.equals(max)|| num.equals(second_max) || num.equals(third_max))
            {
                continue;
            }//important to avoid duplicate values
            
            if(max==null || num > max){//2>1 //assign 3rd= 2nd, 2nd = max , max to num
                third_max=second_max; //1
                second_max=max; //1
                max =num;//2
            }else if(second_max==null || num > second_max){//2>1 // assign 3rd = 2nd , 2nd = num
                third_max = second_max;//1
                second_max = num;//2
            }else if( third_max==null || num > third_max){ //2>1 //assign 3rd = num
                third_max =num;//2
            }
        }
        
        if (third_max==null){
            return max;
        }
        
        return third_max;
        
    }*/
}
