class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Stack<Integer> s = new Stack<>();
        int x =0;

        for(int i=2 * n-1; i>=0; i--  ){
            int current = nums[i%n];
            while(!s.isEmpty() && s.peek() <= current){
                s.pop();
            }
            if(i<n){
                 if(s.isEmpty()){
                arr[i]= -1;
             
            }
            else{
                arr[i] = s.peek();
                
            }

            }
           
            s.push(current);
        }
        return arr;
    }
}