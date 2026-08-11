class Solution {
public double findMaxAverage(int[] nums, int k) {

int[] arr = new int[k];
double avg_new = Double.NEGATIVE_INFINITY;
    int m=0;
    while(m <= nums.length-k){
         int a=0;
    for(int i= m; i<nums.length && a < k ; i++){
        arr[a] = nums[i];
        a++;
    }
    int sum=0;
    for(int i=0 ; i<k ; i++){
       sum = sum+arr[i];
    }
   double avg = (double)sum/k;
   if(avg_new <avg){
    avg_new = avg;
   }
   m++;
    }
   return avg_new;
            
}


}