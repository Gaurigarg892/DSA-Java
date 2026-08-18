class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left =0 ;
        int cost = 0;
        int max= 0;
        for(int right =0; right<s.length() ; right++){
            char ch1 = s.charAt(right);
            char ch2 = t.charAt(right);

             int n1 = (int)ch1;
             int n2 = (int)ch2;

            cost += Math.abs(n2-n1);
            while(cost>maxCost){
                int extra_cost = Math.abs((int)(t.charAt(left))-(int)(s.charAt(left)));
                cost = cost-extra_cost;
                left++;
            }
            if(cost <= maxCost){
            max = Math.max(max , right-left+1);
            }
        }
        return max;   
    }
}