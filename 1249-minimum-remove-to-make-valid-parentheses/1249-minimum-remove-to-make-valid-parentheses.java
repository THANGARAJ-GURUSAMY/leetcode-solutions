class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int open=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                open++;
                stack.push(c);
            }
            else if(c==')')
            {
               if(open>0)
               {
                open--;
                stack.push(c);
               }
             
            }
            else
            {
                stack.push(c);
            }
        }
        while(!stack.isEmpty())
        {
            char ch=stack.pop();
            if(ch=='('&&open>0)
            {
                open--;
                continue;
            }
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}