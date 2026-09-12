class Solution {
    public int countValidPrefixes(String s) {
        int c=1;
        for(int i=1;i<s.length();i++)
        {
            String m=s.substring(0,i+1);
            int oc=0;
            int zc=0;
            for(char c1:m.toCharArray())
            {
                if(c1=='0')
                {
                    zc++;
                }
                else
                {
                    oc++;
                }
            }
            int d=Math.abs(oc-zc);
            if(d<=1)
            {
                c++;
            }
        }
        return c;
    }
}