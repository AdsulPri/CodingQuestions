class Solution {
    public boolean isValid(String s) {
        //Always even
        if (s.length()%2 !=0) return false;
        
        //define stack
        Stack<Character> stack = new Stack();
        
        //Convert string to char array
        for (char c:s.toCharArray()){            
            if (c == '(' || c == '{' || c == '['){
                stack.push(c); //if opening bracket push it
            }else if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop(); // pop it only if the peek matches the opposite one            
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();                
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();                
            }else{
                return false; // important in case of [(}})]
                //OR stack.push(c);
            }
        }
        
        //At the end the stack should be empty
        return stack.isEmpty();
    }
}
