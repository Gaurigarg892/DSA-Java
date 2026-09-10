# Sum of Subarray Minimums

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers arr, find the sum of `min(b)`, where `b` ranges over every (contiguous) subarray of `arr`. Since the answer may be large, return the answer  **modulo**  `109 + 7`.

 

 **Example 1:** 

```
Input: arr = [3,1,2,4]
Output: 17
Explanation: 
Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
Sum is 17.

```

 **Example 2:** 

```
Input: arr = [11,81,94,43,3]
Output: 444

```

 

 **Constraints:** 

- 1 <= arr.length <= 3 * 104
- 1 <= arr[i] <= 3 * 104

## Solution

**Language:** Java  
**Runtime:** 132 ms (beats 81.27%)  
**Memory:** 69.6 MB (beats 84.88%)  
**Submitted:** 2026-09-10T21:01:56.604Z  

```java
class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        long MOD = 1_000_000_007L;
        long ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            
            while (!stack.isEmpty() &&
                   (i == n || arr[stack.peek()] >= arr[i])) {

                int mid = stack.pop();
                int left;
                if (stack.isEmpty()) {
                    left = mid + 1;
                } else {
                    left = mid - stack.peek();
                }

                
                int right = i - mid;
                ans += (long) arr[mid] * left * right;
                ans %= MOD;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return (int) ans;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-subarray-minimums/)