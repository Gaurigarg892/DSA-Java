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
	     System.out.println("no");
	 }
	 if(R-L-1 > 2){
	     System.out.println("YES");
	 }
	 
	 else{
	     if(L+1 % 2 == 0){
	         System.out.println("YES");
	         
	     }
	     else {
	         System.out.println("no");
	     }
	 }

	}
}
