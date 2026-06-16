class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        char c=s.charAt(0);
        int co=1;
        sb.append(c);
        for(int i=1;i<s.length();i++)
        {
            char c1=s.charAt(i);
            if(c1==c)
            {
                co++;
                if(co==3)
                {
                    co--;
                }
                else
                {
                    sb.append(c1);
                }
            }
            else
            {
                co=0;
                sb.append(c1);
                co++;
            }
            c=c1;
        }
        return sb.toString();
    }
}