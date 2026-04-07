class Solution {
    public String freqAlphabets(String s) {
        int i=0;
        int j=2;
        StringBuilder sb=new StringBuilder();
        while(i<s.length())
        {
            if(j<s.length()&&s.charAt(j)=='#')
            {
               String m=s.substring(i,j);
               int n=Integer.parseInt(m);
               char c=(char)(97+n-1);
               sb.append(c);
               i=j+1;
               j=i+2;
            }
            else
            {
                int n=s.charAt(i)-'0';
                char c=(char)('a'+n-1);
                sb.append(c);
                i++;
                j=i+2;
            }
        }
        return sb.toString();

    }
}