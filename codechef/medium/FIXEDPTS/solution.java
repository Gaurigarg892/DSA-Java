import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in =new Scanner(System.in);
	int T= in.nextInt();
	for(int t=1 ; t<=T ; t++){
	    int N = in.nextInt();
	    int K = in.nextInt();
	    
	    if(N-K > 1){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}

	}
}
