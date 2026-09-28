class Solution {
    public static boolean isPalindrome(String s)
    {
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length()<2)
        {
            return s;
        }
        String res="";
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String m=s.substring(i,j+1);
                if(isPalindrome(m))
                {
                    if(m.length()>res.length())
                    {
                        res=m;
                    }
                }
            }
        }
        return res;
    }
}