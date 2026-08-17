# Maximum Points You Can Obtain from Cards

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There are several cards  **arranged in a row**, and each card has an associated number of points. The points are given in the integer array `cardPoints`.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly `k` cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array `cardPoints` and the integer `k`, return the  *maximum score*  you can obtain.

 

 **Example 1:** 

```
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

```

 **Example 2:** 

```
Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.

```

 **Example 3:** 

```
Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.

```

 

 **Constraints:** 

- 1 <= cardPoints.length <= 105
- 1 <= cardPoints[i] <= 104
- 1 <= k <= cardPoints.length

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 4.88%)  
**Memory:** 61.9 MB (beats 17.26%)  
**Submitted:** 2026-08-17T11:35:36.122Z  

```java
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total_sum = 0; 
        int left = 0; 
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int right =0 ; right<cardPoints.length; right++){
            total_sum +=cardPoints[right];
             sum += cardPoints[right];
                int n = cardPoints.length -k;
                if(n ==0){
                    min= 0 ;
                }
                else{
            if(right >=n -1){
                min  = Math.min(min , sum);
                sum -= cardPoints[left];
                left++;
                
            }
                }
        }
            int score = total_sum - min;
        return score;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/)