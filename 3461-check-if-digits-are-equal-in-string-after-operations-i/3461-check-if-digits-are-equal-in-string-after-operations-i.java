class Solution {
    public boolean hasSameDigits(String s) {
        String r="";
        while(true)
        {
            String res="";
            for(int i=1;i<s.length();i++)
            {
                int n1=s.charAt(i-1)-'0';
                int n2=s.charAt(i)-'0';
                res+=((n1+n2)%10);
            }
            if(res.length()==2)
            {
                r=res;
                break;
            }
            s=res;
        }
        if(r.charAt(0)!=r.charAt(1))
        {
            return false;
        }
        return true;
    }
}