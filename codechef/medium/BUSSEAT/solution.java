import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
	int T= in.nextInt();
	for(int t=1; t<= T ; t++ ){
	    int N= in.nextInt();
	    int K = in.nextInt();
	    if(K <= N){
	       System.out.println(0) ;
	    }
	    else if(K == 2 * N){
	        System.out.println(K);
	    }
	    else{
	        System.out.println(2 * (K-N));
	    }
	}

	}
}
