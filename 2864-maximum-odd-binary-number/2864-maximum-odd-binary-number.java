class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        for(char c:s.toCharArray())
        {
            if(c=='1')
            {
                one++;
            }
        }
        int n=s.length();
        char[] a=new char[n];
        Arrays.fill(a,'0');
        if(one>0)
        {
            a[n-1]='1';
            one--;
        }
        for(int i=0;i<one;i++)
        {
            a[i]='1';
        }
        return new String(a);
    }
}