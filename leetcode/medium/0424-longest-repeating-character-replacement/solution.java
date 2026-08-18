class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0; 
        int max =0;
        int maxFreq= 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int right =0; right<s.length() ; right++){
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right) , 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

         int changes = (right - left + 1) - maxFreq;

            while(changes>k){
                 map.put(s.charAt(left) , map.get(s.charAt(left) ) - 1);
                 
                left++;
                changes = (right - left + 1) - maxFreq;
                
            }
            max= Math.max(max , right-left+1);
        }
        return max;
        
    }
}