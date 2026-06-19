class Solution {
    public boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            char c1=words[i].charAt(0);
            char c2=words[i].charAt(words[i].length()-1);
            if(isVowel(c1)&&isVowel(c2))
            {
                c++;
            }

        }
        return c;
    }
}