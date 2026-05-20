class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        int size=n;
        for(int i=2;i<=5;i++)
        {
           while(n%i==0)
           {
              if(i==2||i==3||i==5)
              {
                n/=i;
              }
              else
              {
                return false;
              }
           }
        }
        return n==1;
    }
}