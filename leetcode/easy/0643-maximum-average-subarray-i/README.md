# Maximum Average Subarray I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose  **length is equal to**  `k` that has the maximum average value and return  *this value*. Any answer with a calculation error less than `10-5` will be accepted.

 

 **Example 1:** 

```
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

```

 **Example 2:** 

```
Input: nums = [5], k = 1
Output: 5.00000

```

 

 **Constraints:** 

- n == nums.length
- 1 <= k <= n <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 2276 ms  
**Memory:** 50.9 MB  
**Submitted:** 2026-08-11T14:08:57.940Z  

```java
class Solution {
public double findMaxAverage(int[] nums, int k) {

int[] arr = new int[k];
double avg_new = Double.NEGATIVE_INFINITY;
    int m=0;
    while(m <= nums.length-k){
         int a=0;
    for(int i= m; i<nums.length && a < k ; i++){
        arr[a] = nums[i];
        a++;
    }
    int sum=0;
    for(int i=0 ; i<k ; i++){
       sum = sum+arr[i];
    }
   double avg = (double)sum/k;
   if(avg_new <avg){
    avg_new = avg;
   }
   m++;
    }
   return avg_new;
            
}


}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)