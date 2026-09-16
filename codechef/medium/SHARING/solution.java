import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner (System.in);
		int A= in.nextInt();
		int B = in.nextInt();
		int res = (A-B) % 2 ;
		if(res == 0){
		    System.out.println((A-B)/2);
		}
		else{
		    System.out.println(-1);
		}
	}
}
