import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner in = new Scanner(System.in);
	 int L= in.nextInt();
	 int R = in.nextInt();
	 
	 if(L == R){
	     return no;
	 }
	 if(R-L-1 > 2){
	     return yes;
	 }
	 
	 else{
	     if(L+1 % 2 == 0){
	         return YES;
	         
	     }
	     else {
	         return no;
	     }
	 }

	}
}
