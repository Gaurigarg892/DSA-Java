import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i= 0 ; i<T ; i++){
		    int N = in.nextInt();
		    int max_sum = 0;
		    int sum =0;
		    int[] arr = new int[N];
		    
		    for(int j=0; j<N ;j++){
		        arr[j] = in.nextInt();
		    }
		    int count= 0;
		    for(int a= 0; a<N; a++){
		        max_sum = Math.max(max_sum, arr[a]);
		        for(int b=a+1 ; b<N ; b++){
		            if(arr[a]<arr[b]){
		                sum = arr[a]+arr[b];
		            }
		            max_sum = Math.max(max_sum ,sum);
		        }
		    }
		    System.out.println(max_sum);
		}

	}
}
