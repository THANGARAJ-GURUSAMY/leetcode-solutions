class Solution {
    public int maxScore(String s) {
        int i=0;
        int max=Integer.MIN_VALUE;
        while(i<s.length()-1)
        {
            String s1=s.substring(0,i+1);
            String s2=s.substring(i+1);
            int c1=0;
            int c2=0;
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(j)=='0')
                {
                    c1++;
                }
            }
            for(int j=0;j<s2.length();j++)
            {
                if(s2.charAt(j)=='1')
                {
                    c2++;
                }
            }
            int tot=c1+c2;
            max=Math.max(max,tot);
            i++;
        }
        return max;
    }
}