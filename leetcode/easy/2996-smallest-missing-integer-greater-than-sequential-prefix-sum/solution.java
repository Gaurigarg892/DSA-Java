class Solution {
    public int missingInteger(int[] nums) {
        boolean b =false;
        int x=0;
        int sum=nums[0];
        for(int j=1; j<nums.length ; j++)
        {
            if(nums[j] == nums[j-1]+1){
                sum = sum+nums[j];
                 if(x<sum){
               x= sum;
            }
            }
            else{
                sum = nums[j];
                continue;
            }
        }
            while(b == false)
            {
                for(int i=0; i<nums.length ; i++){
                    if(x == nums[i]){
                        x++;
                        continue;
                    }
                    else{
                        b= true;
                    }
                }
            }
         if(b==true)
         {
                    return x;
                }
        return x;
    }
}

