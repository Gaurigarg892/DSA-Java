class Solution {
    public int trap(int[] height) {
        int n = height.length;
       ArrayList<Integer> l_max = new ArrayList<>();
       ArrayList<Integer> r_max = new ArrayList<>();

       l_max.add(height[0]);
       

        for (int i = 0; i < n; i++) {
            r_max.add(0);
        }
         r_max.set(n - 1, height[n - 1]);

       for(int i=1; i<n ; i++){
        l_max.add(Math.max(l_max.get(i-1), height[i]));
       }

       for(int i=n-2 ; i>= 0 ; i--){
       r_max.set(i, Math.max(r_max.get(i + 1), height[i]));
       }
       

       int ans = 0;
       for(int i=0;  i<n ; i++){
        ans += Math.min(l_max.get(i) , r_max.get(i)) - height[i];
       }

       return ans;
        
    }
}