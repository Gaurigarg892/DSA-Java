# ODDEVEN7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Odd Even

An array $B$ is called good if the parity of the elements keep alternating, i.e. odd, even, odd,.... or even, odd, even,...

You are given an array $A$ containing $N$ integers, and you can do the following action:

- Choose some subset of elements of $A$, and then rearrange that subset to form a good array.

Find the maximum size of subset you can choose which can be rearranged to a good array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum size of a subset.

### Constraints
- $1 \le T \le 100$
- $1 \le N \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
2
5
1 3 7 4 5
4
1 1 2 4

```

```
3
4
```

### Explanation:

 **Test Case 1:**  We can choose the subset $\{1, 4, 5\}$. There is no need to reorder it, as it is already alternating.

 **Test Case 2:**  We can choose the subset $\{1, 1, 2, 4\}$ and reorder to get $[1, 2, 1, 4]$ which is alternating parity.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T16:25:31.410Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	for(int i=0 ; i<T ; i++){
	    int N = in.nextInt();
	  int[] arr = new int[N];
	  for(int j=0; j<N ;j++){
	      arr[j] = in.nextInt();
	      
	  }
	  ArrayList<Integer> subset_even = new ArrayList<>();
	  ArrayList<Integer> subset_odd = new ArrayList<>();
	  int max =0;
	  
	  for(int a=0; a<N ;a++){
	      if(arr[a]%2 == 0){
	          subset_even.add(arr[a]);
	          
	      }
	      else{
	          subset_odd.add(arr[a]);
	      }
	      
	      if(subset_even.size()==subset_odd.size())
	      {
	          max = subset_even.size() * 2;
	      }
	      else {
	  max = ((Math.min(subset_even.size() , subset_odd.size()) * 2) + 1);}
	  }
	  System.out.println(max);
	}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ODDEVEN7)