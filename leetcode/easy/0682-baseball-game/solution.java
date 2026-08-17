import java.util.*;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            String op = operations[i];

            if (op.equals("C")) {
                s.pop();
            }

            else if (op.equals("D")) {
                s.push(2 * s.peek());
            }

            else if (op.equals("+")) {
                int top = s.pop();
                int secondTop = s.peek();

                s.push(top);
                s.push(top + secondTop);
            }

            else {
                s.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while (!s.isEmpty()) {
            sum += s.pop();
        }

        return sum;
    }
}