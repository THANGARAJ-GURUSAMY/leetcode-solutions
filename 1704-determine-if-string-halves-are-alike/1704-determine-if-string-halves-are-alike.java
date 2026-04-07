class Solution {
    static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean halvesAreAlike(String s) {
        int m=s.length()/2;
        String s1="";
        String s2="";
        for(int i=0;i<m;i++)
        {
            s1+=s.charAt(i);
        }
        for(int i=m;i<s.length();i++)
        {
            s2+=s.charAt(i);
        }
        int c1=0;
        int c2=0;
        for(char c:s1.toCharArray())
        {
            if(isVowel(c))
            {
                c1++;
            }
        }
        for(char c:s2.toCharArray())
        {
            if(isVowel(c))
            {
                c2++;
            }
        }
        return c1==c2;

    }
}