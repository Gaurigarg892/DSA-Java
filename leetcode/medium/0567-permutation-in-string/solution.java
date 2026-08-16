class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0 ; 
        boolean b= false;
        HashMap<Character , Integer> s1_map = new HashMap<>();
        HashMap<Character , Integer> s2_map = new HashMap<>();
            int k = s1.length();
        for(int i = 0; i<s1.length() ; i++){
            s1_map.put(s1.charAt(i) , s1_map.getOrDefault(s1.charAt(i) , 0 ) + 1);
        }

        for(int right = 0; right<s2.length() ; right++){
            s2_map.put(s2.charAt(right) , s2_map.getOrDefault(s2.charAt(right) , 0 ) + 1);

            if(right>= k-1){
                if(s2_map.equals(s1_map)){
                    b =true;
                    
                }
                s2_map.put(s2.charAt(left) , s2_map.get(s2.charAt(left)) - 1);
                if(s2_map.get(s2.charAt(left)) == 0){
                    s2_map.remove(s2.charAt(left));
                }
                left++;

            }
        }
        return b;
    }
}