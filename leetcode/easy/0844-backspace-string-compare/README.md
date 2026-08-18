# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 20.72%)  
**Memory:** 43 MB (beats 54.02%)  
**Submitted:** 2026-08-18T10:16:23.901Z  

```java
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i =0 ; i<s.length() ; i++){
            Character ch = s.charAt(i);
            if(!stack1.isEmpty() && ch == '#'){
                stack1.pop();

            }
            else if(stack1.isEmpty() && ch == '#'){
            continue;
            }
            else{
                stack1.push(ch);

            }
        }
        for(int j=0; j<t.length() ; j++){
            Character ch = t.charAt(j);
            if(!stack2.isEmpty() && ch == '#'){
                stack2.pop();

            }
            else if(stack2.isEmpty() && ch == '#'){
            continue;
            }
            else{
                stack2.push(ch);

            }

        }
        if(stack1.equals(stack2)){
            return true;
        }
        else
         return false ;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)