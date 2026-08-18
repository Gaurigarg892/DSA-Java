class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0 ;
        int sum = 0;
         int max = 0;
         HashMap<Integer , Integer> map = new HashMap<>();
        for(int right =0; right<nums.length; right++){
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);
            sum += nums[right];

            while(map.get(nums[right]) >1){
                sum -= nums[left];
                map.put(nums[left] , map.get(nums[left]) - 1);
                left++;
            }
            max = Math.max(max , sum);
        }
        return max;
    }
}