class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n=password.length();
        int lc=0;
        int uc=0;
        int d=0;
        int sp=0;
        char c1=password.charAt(0);
        if(Character.isUpperCase(c1))
        {
            uc++;
        }
        else if(Character.isLowerCase(c1))
        {
            lc++;
        }
        else if(Character.isDigit(c1))
        {
            d++;
        }
        else if("!@#$%^&*()-+".indexOf(c1)!=-1)
        {
            sp++;
        }
        for(int i=1;i<n;i++)
        {
            char c=password.charAt(i);
            if(c1==c)
            {
              return false;
            }
            if(Character.isUpperCase(c))
            {
                uc++;
            }
            else if(Character.isLowerCase(c))
            {
                lc++;
            }
            else if(Character.isDigit(c))
            {
                d++;
            }
            else if("!@#$%^&*()-+".indexOf(c)!=-1)
            {
                sp++;
            }   
            c1=c;
        }
        if(n>=8&&lc>=1&&uc>=1&&sp>=1&&d>=1)
        {
            return true;
        }
        return false;
    }
}