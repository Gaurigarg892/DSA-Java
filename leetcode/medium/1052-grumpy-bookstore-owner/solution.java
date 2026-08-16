class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int left = 0;
        int toBeHappy = 0;
        int total_customers = 0;
        int max=0 ;
          int satisfied = 0;
        for(int right =0; right<customers.length ; right++){
            if(grumpy[right]==0){
                satisfied += customers[right];
            }
            else{
                toBeHappy += customers[right];
            }
            if(right>= minutes-1){
                if(max < toBeHappy){
                    max = toBeHappy;
                }
                if(grumpy[left]==1){
                    toBeHappy -= customers[left];
              
                }
                  left++;
                
            }
            

            total_customers = satisfied + max;
        }
        return total_customers;
    }
}