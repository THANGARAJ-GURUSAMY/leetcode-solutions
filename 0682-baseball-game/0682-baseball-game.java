class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack=new Stack<>();
        int tot=0;
        for(String m:operations)
        {
            if(m.equals("C"))
            {
               stack.pop();
            }
            else if(m.equals("D"))
            {
                String m1=stack.peek();
                int n=Integer.parseInt(m1);
                int num=2*n;
                String m2=String.valueOf(num);
                stack.push(m2);
            }
            else if(m.equals("+"))
            {
                String top1=stack.pop();
                String top2=stack.peek();
                int sum=Integer.parseInt(top1)+Integer.parseInt(top2);
                stack.push(top1);
                stack.push(String.valueOf(sum));
            }
            else
            {
                stack.push(m);
            }
        }
        while(!stack.isEmpty())
        {
            tot+=Integer.parseInt(stack.pop());
        }
        return tot;
    }
}