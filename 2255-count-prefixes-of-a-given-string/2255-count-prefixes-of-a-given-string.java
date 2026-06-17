class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String m:words)
        {
            if(s.startsWith(m))
            {
                c++;
            }
        }
        return c;
    }
}