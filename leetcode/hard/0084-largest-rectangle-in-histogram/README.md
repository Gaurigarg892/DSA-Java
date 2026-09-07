# Largest Rectangle in Histogram

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array of integers `heights` representing the histogram's bar height where the width of each bar is `1`, return  *the area of the largest rectangle in the histogram*.

 

 **Example 1:** 

```
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

```

 **Example 2:** 

```
Input: heights = [2,4]
Output: 4

```

 

 **Constraints:** 

- 1 <= heights.length <= 105
- 0 <= heights[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 92 ms (beats 34.20%)  
**Memory:** 77.6 MB (beats 71.87%)  
**Submitted:** 2026-09-07T11:48:39.969Z  

```java
class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n= heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> s = new  Stack<>();
        //right smaller 
        for(int i= n-1; i>= 0 ; i--){
            while(!s.empty() &&  heights[s.peek()] >= heights[i]){
                s.pop();

            }
            right[i] = s.empty() ? n : s.peek();
            s.push(i);
        }

        while(!s.empty()){
            s.pop();
        }

        //left smaller 
        for(int i=0 ; i<n ;i++){
            while(!s.empty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            left[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }

        int ans =0; 
        for(int i=0 ; i<n ; i++){

            int width = right[i] - left[i]-1;
            int currArea = heights[i] * width ; 
            ans = Math.max(ans , currArea);
        }
        return ans;
        

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-rectangle-in-histogram/)