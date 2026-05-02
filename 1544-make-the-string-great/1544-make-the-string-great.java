class Solution {
    public String makeGood(String s) {
        int d='a'-'A';
        while(true)
        {
            String res=s;
            Stack<Character> stack=new Stack<>();
            for(char c:s.toCharArray())
            {
                int n=c-'a';
                if(!stack.isEmpty()&&Math.abs(stack.peek()-c)==d)
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
            StringBuilder sb=new StringBuilder();
            while(!stack.isEmpty())
            {
                sb.append(stack.pop());
            }
            s=sb.reverse().toString();
            if(res.equals(s))
            {
                break;
            }
        }
        return s;
        
    }
}