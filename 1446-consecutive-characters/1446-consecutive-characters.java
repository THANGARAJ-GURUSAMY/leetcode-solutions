class Solution {
    public int maxPower(String s) {
        char c=s.charAt(0);
        int co=1;
        int max=co;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                max=Math.max(max,co);
                co=0;
            }
            c=s.charAt(i);
            co++;

        }
        return Math.max(max,co);
    }
}