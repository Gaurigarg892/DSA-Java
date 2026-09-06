class Solution {
    public int trap(int[] height) {
        int ans=0;
         int left = 0;
          int right = height.length -1;
          int l_max = height[0];
          int r_max = height[height.length - 1];

          while(left<right){
           l_max = Math.max(l_max , height[left]);
            r_max = Math.max(r_max , height[right]);

            if(l_max < r_max ){
                ans += l_max - height[left];
                left++;
             }

             else{
                ans += r_max -height[right];
                right--;
             }
          }
        return ans ;
    }
}