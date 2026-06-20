class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        StringBuilder sb=new StringBuilder();
        String m="";
        for(char c:s1.toCharArray())
        {
            m+=c;
            if(!s2.startsWith(m)||!s3.startsWith(m))
            {
                break;
            }
            else
            {
                sb.append(c);
            }
        }
        if(sb.length()==0)
        {
            return -1;
        }
        int p=sb.length();
        return (s1.length()-p)+(s2.length()-p)+(s3.length()-p);
    }
}