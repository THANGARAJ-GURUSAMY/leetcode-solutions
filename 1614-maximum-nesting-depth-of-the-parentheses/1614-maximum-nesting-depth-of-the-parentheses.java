class Solution {
    public int maxDepth(String s1) {
        Stack<Character> s=new Stack<>();
        int max=0;
        for(char c:s1.toCharArray())
        {
            if(c=='(')
            {
                s.push(c);
                max=Math.max(max,s.size());
            }
            else if(c==')'&&!s.isEmpty())
            {
                s.pop();
            }
        }
        return max;
    }
}