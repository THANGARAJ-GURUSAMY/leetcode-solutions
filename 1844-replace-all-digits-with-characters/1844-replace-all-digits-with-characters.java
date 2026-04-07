class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetter(c))
            {
                sb.append(c);
            }
            else if(Character.isDigit(c))
            {
                char c1=s.charAt(i-1);
                int n=c-'0';
                sb.append((char)(c1+n));
            }
        }
        return sb.toString();
    }
}