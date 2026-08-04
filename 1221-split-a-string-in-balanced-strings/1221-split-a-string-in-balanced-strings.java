class Solution {
    public int balancedStringSplit(String s) {
      int l=0;
      int r=0;
      int c=0;
      for(char ch:s.toCharArray())
      {
        if(ch=='L')
        {
            l++;
        }
        else if(ch=='R')
        {
            r++;
        }
        if(l==r)
        {
            c++;
        }
      }
      return c;
    }
}