# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 13.13%)  
**Memory:** 43.8 MB (beats 5.66%)  
**Submitted:** 2026-08-21T13:50:34.782Z  

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || 
                s.charAt(i) == '{' || 
                s.charAt(i) == '[') {

                stack1.push(s.charAt(i));
            }

            else {
                if (stack1.isEmpty()) {
                    return false;
                }

                if ((s.charAt(i) == ')' && stack1.peek() == '(') ||
                    (s.charAt(i) == ']' && stack1.peek() == '[') ||
                    (s.charAt(i) == '}' && stack1.peek() == '{')) {

                    stack1.pop();
                }

                else {
                    return false;
                }
            }
        }

        return stack1.isEmpty();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)