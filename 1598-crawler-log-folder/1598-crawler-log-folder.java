class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack=new Stack<>();
        int c=0;
        for(String t:logs)
        {
            if(t.startsWith(".."))
            {
                if(!stack.isEmpty())
                {
                stack.pop();
                }
            }
            else if(t.startsWith("."))
            {
                continue;
            }
            else
            {
                stack.push(t);
            }
        }
        return c+stack.size();
    }
}