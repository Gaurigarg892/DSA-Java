import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner (System.in);
		int N = in.nextInt();
		
		if(N==0){
		    System.out.println(10);
		}
		
		int x= N%10;
		System.out.println(10-x);

	}
}
