class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean f=false;
        for(char c:s.toCharArray())
        {
            if(c=='|')
            {
                f=!f;
            }
            else if(c=='*'&&!f)
            {
                count++;
            }
        }
        return count;
    }
}