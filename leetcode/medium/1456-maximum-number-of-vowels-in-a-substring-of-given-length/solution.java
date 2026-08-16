class Solution {
    public int maxVowels(String s, int k) {

        int left = 0;
        int vowel = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add right character
            if (s.charAt(right) == 'a' ||
                s.charAt(right) == 'e' ||
                s.charAt(right) == 'i' ||
                s.charAt(right) == 'o' ||
                s.charAt(right) == 'u') {

                vowel++;
            }

            // Window has exactly k characters
            if (right >= k - 1) {

                max = Math.max(max, vowel);

                // Remove left character before sliding
                if (s.charAt(left) == 'a' ||
                    s.charAt(left) == 'e' ||
                    s.charAt(left) == 'i' ||
                    s.charAt(left) == 'o' ||
                    s.charAt(left) == 'u') {

                    vowel--;
                }

                left++;
            }
        }

        return max;
    }
}