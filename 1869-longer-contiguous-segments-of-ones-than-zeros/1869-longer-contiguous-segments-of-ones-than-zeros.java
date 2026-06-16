class Solution {
    public boolean checkZeroOnes(String s) {
        int co=0;
        int max1=0;
        for(char c:s.toCharArray())
        {
            if(c=='1')
            {
                co++;
            }
            else
            {
                max1=Math.max(max1,co);
                co=0;
            }
        }
        max1=Math.max(max1,co);
        int max2=0;
        co=0;
        for(char c:s.toCharArray())
        {
            if(c=='0')
            {
                co++;
            }
            else
            {
                max2=Math.max(max2,co);
                co=0;
            }
        }
        max2=Math.max(max2,co);
        return max1>max2;

    }
}