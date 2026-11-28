class Solution {
    public static boolean isPal(String s)
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
    public int countSubstrings(String s) {
        int c=s.length();
        for(int i=0;i<s.length()-1;i++)
        {
            int j=i+1;
            while(j<s.length())
            {
                String m=s.substring(i,j+1);
                if(isPal(m))
                {
                    c++;
                }
                j++;
            }
        }
        return c;
    }
}