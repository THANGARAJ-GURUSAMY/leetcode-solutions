class Solution {
    public int percentageLetter(String s, char letter) {
        int co=0;
        int n=s.length();
        for(char c:s.toCharArray())
        {
            if(c==letter)
            {
               co++;
            }
        }
        return (co*100)/n;
    }
}