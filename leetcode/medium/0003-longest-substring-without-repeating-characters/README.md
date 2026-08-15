# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 99 ms (beats 5.86%)  
**Memory:** 47.5 MB (beats 29.35%)  
**Submitted:** 2026-08-15T20:46:55.989Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)