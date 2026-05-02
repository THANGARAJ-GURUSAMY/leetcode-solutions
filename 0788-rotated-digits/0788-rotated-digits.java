class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            boolean valid=true;
            boolean change=false;
            while(num>0)
            {
                int t=num%10;
                if(t==3||t==4||t==7)
                {
                    valid=false;
                    break;
                }
                if(t==2||t==5||t==6||t==9)
                {
                    change=true;
                }
                num/=10;
               
            }
            if(valid&&change)
            {
                c++;
            }
        }
        return c;
    }
}