class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total_sum = 0; 
        int left = 0; 
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int right =0 ; right<cardPoints.length; right++){
            total_sum +=cardPoints[right];
             sum += cardPoints[right];
                int n = cardPoints.length -k;
                if(n ==0){
                    min= 0 ;
                }
                else{
            if(right >=n -1){
                min  = Math.min(min , sum);
                sum -= cardPoints[left];
                left++;
                
            }
                }
        }
            int score = total_sum - min;
        return score;
    }
}