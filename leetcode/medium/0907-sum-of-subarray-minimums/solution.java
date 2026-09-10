class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        long MOD = 1_000_000_007L;
        long ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            
            while (!stack.isEmpty() &&
                   (i == n || arr[stack.peek()] >= arr[i])) {

                int mid = stack.pop();
                int left;
                if (stack.isEmpty()) {
                    left = mid + 1;
                } else {
                    left = mid - stack.peek();
                }

                
                int right = i - mid;
                ans += (long) arr[mid] * left * right;
                ans %= MOD;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return (int) ans;
    }
}
