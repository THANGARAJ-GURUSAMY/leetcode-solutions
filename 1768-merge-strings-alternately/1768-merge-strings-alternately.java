class Solution {
    public String mergeAlternately(String word1, String word2) {
        String m="";
        int i=0;
        int j=0;
        while(i<word1.length()&&j<word2.length())
        {
            m+=word1.charAt(i);
            m+=word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length())
        {
           m+=word1.charAt(i);
           i++;
        }
        while(j<word2.length())
        {
            m+=word2.charAt(j);
            j++;
        }
        return m;
    }
}