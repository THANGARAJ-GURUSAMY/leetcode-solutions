class Solution {
    public String decodeString(String s) {
        Stack<Integer> c=new Stack<>();
        Stack<StringBuilder> str=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int num=0;
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }
            else if(ch=='[')
            {
                c.push(num);
                str.push(curr);
                num=0;
                curr=new StringBuilder();
            }
            else if(ch==']')
            {
                int r=c.pop();
                StringBuilder prev=str.pop();
                for(int i=0;i<r;i++)
                {
                    prev.append(curr);
                }
                curr=prev;
            }
            else
            {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}