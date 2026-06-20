class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int p=0;
        int b=0;
        for(char c:moves.toCharArray())
        {
            if(c=='L')
            {
                p--;
            }
            else if(c=='R')
            {
                p++;
            }
            else
            {
                b++;
            }
        }
        return Math.abs(p)+b;
    }
}