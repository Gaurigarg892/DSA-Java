import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	
	
	for(int i=1; i<=T; i++){
	    int N= in.nextInt();
	    int[] arr = new int[2 * N];
	    
	    for(int j=0; j< 2 * N ; j++){
	        arr[j] = in.nextInt();
	        
	    }
	    int sum=0;
	    for(int a=0 ; a<N; a++){
	       
	        if(arr[a]<arr[2 * N - 1 - a]){
	        arr[a] = arr[2 * N  - 1 - a];
	        }
	        sum+= arr[a];
	        
	    }
	    System.out.println(sum);
	}

	}
}
