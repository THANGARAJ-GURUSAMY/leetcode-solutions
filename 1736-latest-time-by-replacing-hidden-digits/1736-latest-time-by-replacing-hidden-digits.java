class Solution {
    public String maximumTime(String time) {
        char[] a=time.toCharArray();
        if(a[0]=='?')
        {
            if(a[1]=='?'||a[1]<='3')
            {
                a[0]='2';
            }
            else
            {
                a[0]='1';
            }
        }
        if(a[1]=='?')
        {
            if(a[0]=='2')
            {
                a[1]='3';
            }
            else
            {
                a[1]='9';
            }
        }
        if(a[3]=='?')
        {
            a[3]='5';
        }
        if(a[4]=='?')
        {
            a[4]='9';
        }
        return new String(a);
    }
}