class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i =0 ; i<s.length() ; i++){
            Character ch = s.charAt(i);
            if(!stack1.isEmpty() && ch == '#'){
                stack1.pop();

            }
            else if(stack1.isEmpty() && ch == '#'){
            continue;
            }
            else{
                stack1.push(ch);

            }
        }
        for(int j=0; j<t.length() ; j++){
            Character ch = t.charAt(j);
            if(!stack2.isEmpty() && ch == '#'){
                stack2.pop();

            }
            else if(stack2.isEmpty() && ch == '#'){
            continue;
            }
            else{
                stack2.push(ch);

            }

        }
        if(stack1.equals(stack2)){
            return true;
        }
        else
         return false ;

        
    }
}