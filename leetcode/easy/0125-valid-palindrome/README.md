# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 57.16%)  
**Memory:** 44.5 MB (beats 47.41%)  
**Submitted:** 2026-09-02T06:26:40.513Z  

```java
class Solution {
    public boolean isPalindrome(String s) {
      
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length() ; i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 ){
               ch =  Character.toLowerCase(ch);
                sb.append(ch);
            }
            else if(ascii >= 48 && ascii <= 57){
                sb.append(ch);
            }
            else {
                continue;
            }
        }

        int left = 0 ;
         int right= sb.length()-1;

         if(sb.length()== 1){
            return true;
         }
        
        while(left < right){
             if(sb.charAt(left) == sb.charAt(right)){
            left++;
            right--;
            continue;
         }
         else{
            return false;
        
         }
        }
        return true;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)