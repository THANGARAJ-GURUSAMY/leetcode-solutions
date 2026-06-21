class Solution {
    public String trimTrailingVowels(String s) {
        int pos=-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
            {
                pos=i;
                break;
            }
        }
        return s.substring(0,pos+1);
    }
}