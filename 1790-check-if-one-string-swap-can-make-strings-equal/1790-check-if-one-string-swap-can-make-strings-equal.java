class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
        int f=-1,s=-1;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                c++;
                if(f==-1)
                {
                    f=i;
                }
                else
                {
                    s=i;
                }
            }
        }
        if(c==0)
        {
            return true;
        }
        return c==2&&s1.charAt(f)==s2.charAt(s)&&s1.charAt(s)==s2.charAt(f);
       
    }
}