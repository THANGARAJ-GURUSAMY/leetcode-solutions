class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int lc=0;
        int rc=0;
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(ch=='L')
            {
                lc++;
            }
            if(ch=='R')
            {
                rc++;
            }
            if(lc==rc)
            {
                c++;
                lc=0;
                rc=0;
            }
            i++;
        }
        return c;
        
    }
}