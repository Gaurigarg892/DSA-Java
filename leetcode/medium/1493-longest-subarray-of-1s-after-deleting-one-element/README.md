# Longest Subarray of 1's After Deleting One Element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums`, you should delete one element from it.

Return  *the size of the longest non-empty subarray containing only* `1` *'s in the resulting array*. Return `0` if there is no such subarray.

 

 **Example 1:** 

```
Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

```

 **Example 2:** 

```
Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

```

 **Example 3:** 

```
Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 87.22%)  
**Memory:** 65.2 MB (beats 85.81%)  
**Submitted:** 2026-08-18T16:30:33.918Z  

```java
class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int counter=0;
        int max = 0;
         for(int right =0 ; right<nums.length ; right++){
            if(nums[right] == 0){
                 counter++;
            }
           while(counter>1){
                
                if(nums[left] ==0){
                    counter--;
                }
                left++;
            }
            max = Math.max(max , right-left);
         }

        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/)