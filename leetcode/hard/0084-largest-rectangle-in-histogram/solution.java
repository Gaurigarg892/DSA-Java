class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n= heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> s = new  Stack<>();
        //right smaller 
        for(int i= n-1; i>= 0 ; i--){
            while(!s.empty() &&  heights[s.peek()] >= heights[i]){
                s.pop();

            }
            right[i] = s.empty() ? n : s.peek();
            s.push(i);
        }

        while(!s.empty()){
            s.pop();
        }

        //left smaller 
        for(int i=0 ; i<n ;i++){
            while(!s.empty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            left[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }

        int ans =0; 
        for(int i=0 ; i<n ; i++){

            int width = right[i] - left[i]-1;
            int currArea = heights[i] * width ; 
            ans = Math.max(ans , currArea);
        }
        return ans;
        

    }
}