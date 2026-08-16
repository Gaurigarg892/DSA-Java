class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Character , Integer> p_map = new HashMap<>();
        HashMap<Character , Integer> window_map = new HashMap<>();
        int left = 0; 
        for(int i=0 ; i<k; i++){
            p_map.put(p.charAt(i), p_map.getOrDefault(p.charAt(i) , 0) + 1);
        }
        for(int right =0 ; right<s.length() ; right++){
            window_map.put(s.charAt(right) , window_map.getOrDefault(s.charAt(right) , 0) + 1);
           
            if(right>= k-1){
                if(p_map.equals(window_map)){
                    arr.add(left);
                   
                }
                window_map.put(s.charAt(left) , window_map.get(s.charAt(left)) - 1);
                if(window_map.get(s.charAt(left)) == 0){
                    window_map.remove(s.charAt(left));

                }
                left++;
                
                
            }

        }
        return arr;
        
    }
}