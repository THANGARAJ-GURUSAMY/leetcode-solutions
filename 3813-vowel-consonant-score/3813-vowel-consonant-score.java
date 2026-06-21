class Solution {
    public int vowelConsonantScore(String s) {
        int co=0;
        int v=0;
        for(char c:s.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                v++;
            }
            else if(Character.isLetter(c))
            {
                co++;
            }
        }
        if(co==0)
        {
            return 0;
        }
        return v/co;
    }
}