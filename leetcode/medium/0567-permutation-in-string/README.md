# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

 **Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

```

 **Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

```

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 104
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 33 ms (beats 19.15%)  
**Memory:** 47 MB (beats 11.38%)  
**Submitted:** 2026-08-16T21:29:01.292Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)