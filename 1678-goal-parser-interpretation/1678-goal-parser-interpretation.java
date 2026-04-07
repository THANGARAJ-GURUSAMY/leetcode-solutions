class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int k1=0;
        int k2=0;
        for(int i=0;i<command.length();i++)
        {
            char c=command.charAt(i);
            if(c=='(')
            {
                k1=i;
            }
            if(c==')')
            {
                k2=i;
                if(Math.abs(k1-k2)==1)
                {
                    sb.append('o');
                }
                k1=0;
                k2=0;
            }
            if(Character.isLetter(c))
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}