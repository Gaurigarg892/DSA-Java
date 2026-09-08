class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && k > 0) {

                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        
        while (k > 0) {
            stack.pop();
            k--;
        }

       
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.reverse();

        int i = 0;
        while (i < result.length() - 1 && result.charAt(i) == '0') {
            i++;
        }

        return result.substring(i);
    }
}