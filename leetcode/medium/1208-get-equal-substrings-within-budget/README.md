# Get Equal Substrings Within Budget

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two strings `s` and `t` of the same length and an integer `maxCost`.

You want to change `s` to `t`. Changing the `ith` character of `s` to `ith` character of `t` costs `|s[i] - t[i]|` (i.e., the absolute difference between the ASCII values of the characters).

Return  *the maximum length of a substring of* `s` *that can be changed to be the same as the corresponding substring of* `t` *with a cost less than or equal to* `maxCost`. If there is no substring from `s` that can be changed to its corresponding substring from `t`, return `0`.

 

 **Example 1:** 

```
Input: s = "abcd", t = "bcdf", maxCost = 3
Output: 3
Explanation: "abc" of s can change to "bcd".
That costs 3, so the maximum length is 3.

```

 **Example 2:** 

```
Input: s = "abcd", t = "cdef", maxCost = 3
Output: 1
Explanation: Each character in s costs 2 to change to character in t,  so the maximum length is 1.

```

 **Example 3:** 

```
Input: s = "abcd", t = "acde", maxCost = 0
Output: 1
Explanation: You cannot make any change, so the maximum length is 1.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- t.length == s.length
- 0 <= maxCost <= 106
- s and t consist of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 20.17%)  
**Memory:** 44.3 MB (beats 87.77%)  
**Submitted:** 2026-08-18T17:26:03.635Z  

```java
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left =0 ;
        int cost = 0;
        int max= 0;
        for(int right =0; right<s.length() ; right++){
            char ch1 = s.charAt(right);
            char ch2 = t.charAt(right);

             int n1 = (int)ch1;
             int n2 = (int)ch2;

            cost += Math.abs(n2-n1);
            while(cost>maxCost){
                int extra_cost = Math.abs((int)(t.charAt(left))-(int)(s.charAt(left)));
                cost = cost-extra_cost;
                left++;
            }
            if(cost <= maxCost){
            max = Math.max(max , right-left+1);
            }
        }
        return max;   
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/get-equal-substrings-within-budget/)