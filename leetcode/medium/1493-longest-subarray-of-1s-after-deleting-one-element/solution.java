class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int counter=0;
        int max = 0;
         for(int right =0 ; right<nums.length ; right++){
            if(nums[right] == 0){
                 counter++;
            }
           while(counter>1){
                
                if(nums[left] ==0){
                    counter--;
                }
                left++;
            }
            max = Math.max(max , right-left);
         }

        return max;
    }
}