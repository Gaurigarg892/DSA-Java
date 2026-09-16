import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
	int T =in.nextInt();
	for(int t=1 ; t<= T ;t++){
	    int N = in.nextInt();
	    int[] A = new int[N];
	    for(int i=0; i< N ;i++){
	        A[i]= in.nextInt();
	    }
	    int sum = 0;
	    for(int i=0; i< N ;i++){
	        sum += A[i];
	    }
	    
	    Arrays.sort(A);
	    long  Sr=0;
	    int Sb= 0;
	    int Cb =0;
	    int Cr =0;
	    long max =0 ;
	    
	    
	    for(int i =0 ; i< N ; i++){
	        Sb += A[i];
	        Cb = i + 1;
            Sr = sum - Sb;
            Cr = N - Cb;

    long current = Sr * Cb + Sb * Cr;

    if (current > max) {
           max = current;
    }
}

System.out.println(max);
	}

	}
}
