# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 67 ms (beats 17.67%)  
**Memory:** 47.7 MB (beats 15.10%)  
**Submitted:** 2026-08-16T20:58:42.680Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)