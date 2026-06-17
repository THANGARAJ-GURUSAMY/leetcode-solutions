class Solution {
    public boolean checkString(String s) {
        int co=0;
        for(char c:s.toCharArray())
        {
            if(c=='a')
            {
               co++;
            }
        }
        int cc=0;
        for(char c:s.toCharArray())
        {
            if(c=='b')
            {
                break;
            }
            cc++;
        }
        return co==cc;
    }
}