# Daily Temperatures

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `temperatures` represents the daily temperatures, return  *an array*  `answer`  *such that*  `answer[i]`  *is the number of days you have to wait after the*  `ith`  *day to get a warmer temperature*. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

 

 **Example 1:** 

```
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

```

 **Example 2:** 

```
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

```

 **Example 3:** 

```
Input: temperatures = [30,60,90]
Output: [1,1,0]

```

 

 **Constraints:** 

- 1 <= temperatures.length <= 105
- 30 <= temperatures[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 64 ms (beats 46.27%)  
**Memory:** 107.6 MB (beats 32.89%)  
**Submitted:** 2026-08-19T10:20:57.931Z  

```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();

                arr[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return arr;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/daily-temperatures/)