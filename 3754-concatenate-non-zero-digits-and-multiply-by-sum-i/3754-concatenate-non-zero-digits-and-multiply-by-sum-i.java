class Solution {
    public long sumAndMultiply(int n) {
        String s="";
        String m=String.valueOf(n);
        for(char c:m.toCharArray())
        {
            if(c!='0')
            {
                s+=c;
            }
        }
        if (s.length() == 0)
            return 0;
        long num=Long.parseLong(s);
        long sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=(s.charAt(i)-'0');
        }
        return num*sum;
    }
}