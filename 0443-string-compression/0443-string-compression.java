class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)
        {
            return 1;
        }
        int i=1;
        String m="";
        char a=chars[0];
        int j=1;
        while(i<chars.length)
        {
            if(chars[i]!=a)
            {
                m+=a;
                if(j!=1)
                {
                    m+=j;
                    j=1;
                }
                a=chars[i];
            }
            else
            {
                j++;
            }
            i++;
        }
        m+=a;
        if(j!=1)
        {
            m+=j;
        }
        for(int k=0;k<m.length();k++)
        {
            chars[k]=m.charAt(k);
        }
        return m.length();


    }
}