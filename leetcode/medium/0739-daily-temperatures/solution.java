class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();

                arr[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return arr;
    }
}