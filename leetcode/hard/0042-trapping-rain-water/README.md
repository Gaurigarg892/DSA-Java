# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 5.26%)  
**Memory:** 47.6 MB (beats 67.23%)  
**Submitted:** 2026-09-06T16:23:45.903Z  

```java
class Solution {
    public int trap(int[] height) {
        int n = height.length;
       ArrayList<Integer> l_max = new ArrayList<>();
       ArrayList<Integer> r_max = new ArrayList<>();

       l_max.add(height[0]);
       

        for (int i = 0; i < n; i++) {
            r_max.add(0);
        }
         r_max.set(n - 1, height[n - 1]);

       for(int i=1; i<n ; i++){
        l_max.add(Math.max(l_max.get(i-1), height[i]));
       }

       for(int i=n-2 ; i>= 0 ; i--){
       r_max.set(i, Math.max(r_max.get(i + 1), height[i]));
       }
       

       int ans = 0;
       for(int i=0;  i<n ; i++){
        ans += Math.min(l_max.get(i) , r_max.get(i)) - height[i];
       }

       return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)