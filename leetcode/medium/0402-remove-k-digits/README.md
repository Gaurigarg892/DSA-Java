# Remove K Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given string num representing a non-negative integer `num`, and an integer `k`, return  *the smallest possible integer after removing*  `k`  *digits from*  `num`.

 

 **Example 1:** 

```
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

```

 **Example 2:** 

```
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

```

 **Example 3:** 

```
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

```

 

 **Constraints:** 

- 1 <= k <= num.length <= 105
- num consists of only digits.
- num does not have any leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 21 ms (beats 59.35%)  
**Memory:** 48 MB (beats 22.41%)  
**Submitted:** 2026-09-08T18:50:59.778Z  

```java
class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && k > 0) {

                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        
        while (k > 0) {
            stack.pop();
            k--;
        }

       
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.reverse();

        int i = 0;
        while (i < result.length() - 1 && result.charAt(i) == '0') {
            i++;
        }

        return result.substring(i);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-k-digits/)