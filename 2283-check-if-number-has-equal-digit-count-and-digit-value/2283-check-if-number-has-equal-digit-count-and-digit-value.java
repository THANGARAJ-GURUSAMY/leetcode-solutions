class Solution {
    public boolean digitCount(String num) {
        int n=num.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int c=0;
            char c1=(char)(i+'0');
            for(int j=0;j<num.length();j++)
            {
                if(num.charAt(j)==c1)
                {
                    c++;
                }
            }
            sb.append(c);
        }
        return sb.toString().equals(num);
    }
}