class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        for(int i =0, j=s.length()-1; i<s.length()/2; i++, j--)
        {
            if(ch[i]!=ch[j])
            {
                ch[i]=ch[j]=(char)Math.min(ch[i],ch[j]);
            }
        }
        String str= String.valueOf(ch);
        return str;
    }
}