import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in =new Scanner(System.in);
	int T= in.nextInt();
	for(int t=1; t<=T ; t++)
	{
	    int N = in.nextInt();
	    if(N==1){
	        System.out.println(20);
	    }
	    else if(N % 2 == 0){
	        System.out.println((N / 2) * 30);
	    }
	    else{
	        int i= N/2;
	        System.out.println((((N - 1)/2) * 30 )+ 20);
	    }
	    
	}

	}
}
