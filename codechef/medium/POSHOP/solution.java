import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
	int T= in.nextInt();
	for(int i=0 ; i< T; i++){
	     int max_sum = 0;
	    int N =in.nextInt();
	    int[] arr = new int[N];
	    for(int j=0 ;j<N ;j++){
	        arr[j] = in.nextInt();
	        
	    }
	    
	    
	    int left = 0;
	    int count= 0;
	   
	   int sum =0;
	    for(int right = 0; right < N ; right++){
	        
	        while(arr[i] < sum){
	            continue;
	        }
	        while(count < 2){
	            sum += arr[right];
	            count++;
	            
	          
	        }
	        while(count>2){
	            sum -= arr[left];
	            count--;
	            left++;
	            
	            max_sum = Math.max(max_sum , sum);
	        }
	        
	    }
	    
	}
	System.out.println(max_sum);

	}
}
