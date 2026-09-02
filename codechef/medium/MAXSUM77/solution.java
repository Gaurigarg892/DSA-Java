import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int t = 1; t <= T; t++)
        {
            int N = in.nextInt();
            int K = in.nextInt();

            int[] A = new int[N];
            int total = 0;

         
            for(int i = 0; i < N; i++)
            {
                A[i] = in.nextInt();
                total += A[i];
            }

            int minRemoved = Integer.MAX_VALUE;

            
            for(int left = 0; left <= K; left++)
            {
                int right = K - left;
                int removedSum = 0;

      
                for(int i = 0; i < left; i++)
                {
                    removedSum += A[i];
                }

  
                for(int i = N - right; i < N; i++)
                {
                    removedSum += A[i];
                }

                minRemoved = Math.min(minRemoved, removedSum);
            }

            int answer = total - minRemoved;

            System.out.println(answer);
        }
    }
}