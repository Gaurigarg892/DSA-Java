class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0; 
        long sum = 0 ;
       long  max= 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int right =0 ; right<nums.length ; right++){
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);
            sum += nums[right];
                   
                if(right>= k-1){

                    if(map.size()==k){
                        max = Math.max(max, sum);
                }
                  sum -= nums[left];
                   int freq =  map.get(nums[left]) - 1;
                    if(freq== 0){
                    map.remove(nums[left]);
                    }
                    else{
                        map.put(nums[left] , freq);
                   
                }
                 left++;
        }
        }
        return max;
    }
}