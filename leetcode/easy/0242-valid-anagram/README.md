# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 24.08%)  
**Memory:** 46.6 MB (beats 15.97%)  
**Submitted:** 2026-09-17T18:20:28.740Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap <Character , Integer> map1 = new HashMap<>();
        HashMap <Character , Integer> map2 = new HashMap<>();

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map1.put(ch , map1.getOrDefault(ch ,0) + 1);
        }

         for(int i = 0 ; i<t.length() ; i++){
            char ch = t.charAt(i);
            map2.put(ch , map2.getOrDefault(ch ,0) + 1);
        }

        return map1.equals(map2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)