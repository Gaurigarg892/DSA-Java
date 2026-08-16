# Fruit Into Baskets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array `fruits` where `fruits[i]` is the  **type**  of fruit the `ith` tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

- You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
- Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
- Once you reach a tree with fruit that cannot fit in your baskets, you must stop.

Given the integer array `fruits`, return  *the  **maximum**  number of fruits you can pick*.

 

 **Example 1:** 

```
Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.

```

 **Example 2:** 

```
Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].

```

 **Example 3:** 

```
Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].

```

 

 **Constraints:** 

- 1 <= fruits.length <= 105
- 0 <= fruits[i] < fruits.length

## Solution

**Language:** Java  
**Runtime:** 54 ms (beats 66.49%)  
**Memory:** 70.6 MB (beats 42.97%)  
**Submitted:** 2026-08-16T09:32:43.123Z  

```java
class Solution {
    public int totalFruit(int[] fruits) {
        int max =0;
        
        int left = 0;
        int distinct_fruits = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i= 0 ; i<fruits.length ; i++){
             map.put(fruits[i] ,    map.getOrDefault(fruits[i] , 0) + 1  );
          while(map.size()>2){
            map.put(fruits[left] , map.get(fruits[left]) - 1);
            if(map.get(fruits[left]) == 0){
                map.remove(fruits[left]);
            }
            left++;
          }
        
        max = Math.max(max , i-left+1);
        }
        return max;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/fruit-into-baskets/)