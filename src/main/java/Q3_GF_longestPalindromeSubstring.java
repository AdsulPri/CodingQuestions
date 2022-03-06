//Google Facebook
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length()<1) return "";    //if empty string this is longest
        
        int start = 0;
        int end = 0;     
        
        for (int i = 0 ; i< s.length(); i++){            
            int len1 = expandFromCenter(s, i ,i );//when there is only one middle character  - RACECAR
            int len2 = expandFromCenter(s, i , i+1);//middle and middle +1 character - CCBBCA
            int len = Math.max(len1, len2);
            
            if(len > end-start){ // compare length of new palindrome 
                start = i - ((len- 1)/2); // move the start to len-1 /2 place from current index
                end = i+ (len/2);          // move the end to current index + len/2 place      
            }            
        }        
        return s.substring (start, end +1);    // return start and end +1 substring           
    }
    
    public int expandFromCenter (String s, int left, int right){       
        if(s==null || left > right) return 0;
        
        //when the middle character OR middle and middle +1 character is equal keep on checking adjacent characters
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){            
            left--;
            right++;
        }
        
        return right-left-1;   //reduce the length by 1      
    }
}
