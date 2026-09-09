import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner (System.in);
	int X = in.nextInt();
	int Y = in.nextInt();
	int F = in.nextInt();
	
	int p1= 12 * X;
	int p2 = (12 * Y) + F;
	
	System.out.println(Math.min(p1 , p2));

	}
}
