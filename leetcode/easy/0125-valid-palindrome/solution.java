class Solution {
    public boolean isPalindrome(String s) {
      
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length() ; i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 ){
               ch =  Character.toLowerCase(ch);
                sb.append(ch);
            }
            else if(ascii >= 48 && ascii <= 57){
                sb.append(ch);
            }
            else {
                continue;
            }
        }

        int left = 0 ;
         int right= sb.length()-1;

         if(sb.length()== 1){
            return true;
         }
        
        while(left < right){
             if(sb.charAt(left) == sb.charAt(right)){
            left++;
            right--;
            continue;
         }
         else{
            return false;
        
         }
        }
        return true;
        
    }
}