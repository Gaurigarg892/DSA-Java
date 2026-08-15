class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
      int count =0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            map.put(
                s.charAt(right),
                map.getOrDefault(s.charAt(right), 0) + 1
            );

           

            

            boolean valid = true;

            if (map.get(s.charAt(right)) > 1) {
                valid = false;
            }

            while (!valid) {

                map.put(
                    s.charAt(left),
                    map.get(s.charAt(left)) - 1
                );

                left++;

                if (map.get(s.charAt(right)) <= 1) {
                    valid = true;
                }
            }
           count= right -left +1;
           max = Math.max(max, count);
        }

        return max;
    }
}