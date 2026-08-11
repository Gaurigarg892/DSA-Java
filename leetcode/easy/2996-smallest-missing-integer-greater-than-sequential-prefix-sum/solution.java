class Solution {
    public int missingInteger(int[] nums) {
        boolean b =false;
        
        int sum=nums[0];
        for(int j=1; j<nums.length ; j++)
        {
            if(nums[j] == nums[j-1]+1){
                sum = sum+nums[j];
            }
            else{
                break;
            }
        }
            while(true){
                boolean found = false;
                for(int i =0 ; i<nums.length ; i++){
                    if(sum == nums[i]){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    return sum;
                }
                sum++;
            }
  
    }
}

