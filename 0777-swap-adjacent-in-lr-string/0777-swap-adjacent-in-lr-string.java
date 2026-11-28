class Solution {
    public boolean canTransform(String start, String result) {
        String m1="";
        for(char c:start.toCharArray())
        {
            if(c!='X')
            {
                m1+=c;
            }
        }
        String m2="";
        for(char c:result.toCharArray())
        {
            if(c!='X')
            {
                m2+=c;
            }
        }
        if(!m1.equals(m2))
        {
            return false;
        }
        int i=0;
        int j=0;
        while(i<start.length()&&j<result.length())
        {
            if(start.charAt(i)=='X')
            {
                i++;
                continue;
            }
            if(result.charAt(j)=='X')
            {
                j++;
                continue;
            }
            char c1=start.charAt(i);
            if(c1=='L'&&i<j)
            {
                return false;
            }
            if(c1=='R'&&i>j)
            {
                return false;
            }
            i++;
            j++;

        }
        return true;

        
        
    }
}