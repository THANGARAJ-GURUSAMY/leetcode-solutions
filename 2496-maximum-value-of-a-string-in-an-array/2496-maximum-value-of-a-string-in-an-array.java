class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(String s:strs)
        {
            int n=0;
            boolean digit=true;
            for(char c:s.toCharArray())
            {
                if(!Character.isDigit(c))
                {
                    digit=false;
                    break;
                }
            }
            if(digit)
            {
                n=Integer.parseInt(s);
            }
            else
            {
                n=s.length();
            }
            max=Math.max(max,n);
        }
        return max;
    }
}