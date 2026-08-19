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
