# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 19.81%)  
**Memory:** 47.3 MB (beats 11.73%)  
**Submitted:** 2026-08-18T18:44:26.770Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)