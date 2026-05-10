class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String c : tokens)
        {
            char m = c.charAt(0);

            if(c.length() > 1 || (m != '+' && m != '-' && m != '*' && m != '/'))
            {
                int num = Integer.parseInt(c);
                stack.push(num);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    int num1 = stack.pop();
                    int num2 = stack.pop();

                    if(m == '+')
                    {
                        stack.push(num2 + num1);
                    }
                    else if(m == '-')
                    {
                        stack.push(num2 - num1);
                    }
                    else if(m == '*')
                    {
                        stack.push(num2 * num1);
                    }
                    else if(m == '/')
                    {
                        stack.push(num2 / num1);
                    }
                }
            }
        }

        return stack.peek();
    }
}