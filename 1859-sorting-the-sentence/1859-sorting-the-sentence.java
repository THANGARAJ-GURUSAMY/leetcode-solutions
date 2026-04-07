class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        String[] res=new String[a.length];
        StringBuilder sb=new StringBuilder();
        for(String m:a)
        {
            char c=m.charAt(m.length()-1);
            int n=c-'0';
            String m1=m.substring(0,m.length()-1);
            res[n-1]=m1;
        }
        for(int i=0;i<res.length;i++)
        {
            sb.append(res[i]);
            if(i<res.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}