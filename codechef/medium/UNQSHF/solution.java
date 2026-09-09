import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		for(int t = 1 ; t <= T ; t++){
		    int N =in.nextInt();
		    String A = in.next();
		    String B = in.next();
		    
		    for(int i=0; i< N ; i++){
		        if(A.charAt(i) == "a"){
		            counter1++;
		            
		        }
		        if(B.charAt(i) == "a"){
		            counter2++;
		            
		        }
		        else{
		            continue;
		        }
		        
		    }
		    if(counter1 == counter2){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("YES");
		    }
		}

	}
}
