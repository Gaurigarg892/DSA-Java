# Maximum Erasure Value

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of positive integers `nums` and want to erase a subarray containing  **unique elements**. The  **score**  you get by erasing the subarray is equal to the  **sum**  of its elements.

Return  *the  **maximum score**  you can get by erasing  **exactly one**  subarray.* 

An array `b` is called to be a subarray of `a` if it forms a contiguous subsequence of `a`, that is, if it is equal to `a[l],a[l+1],...,a[r]` for some `(l,r)`.

 

 **Example 1:** 

```
Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].

```

 **Example 2:** 

```
Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 81 ms (beats 12.22%)  
**Memory:** 94.6 MB (beats 11.99%)  
**Submitted:** 2026-08-18T13:49:43.820Z  

```java
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0 ;
        int sum = 0;
         int max = 0;
         HashMap<Integer , Integer> map = new HashMap<>();
        for(int right =0; right<nums.length; right++){
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);
            sum += nums[right];

            while(map.get(nums[right]) >1){
                sum -= nums[left];
                map.put(nums[left] , map.get(nums[left]) - 1);
                left++;
            }
            max = Math.max(max , sum);
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-erasure-value/)