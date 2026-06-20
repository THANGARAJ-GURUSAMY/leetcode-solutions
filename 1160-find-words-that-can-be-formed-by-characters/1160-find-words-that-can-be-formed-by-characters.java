class Solution {
    public int countCharacters(String[] words, String chars) {
        int c1=0;
        for(String m:words)
        {
            char[] a=chars.toCharArray();
            boolean ok=true;
            for(char c:m.toCharArray())
            {
                boolean found=false;
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]==c)
                    {
                        a[i]='%';
                        found=true;
                        break;
                    }
                }  
                if(!found)
                {
                    ok=false;
                    break;
                }
            }
            if(ok)
            {
                c1+=m.length();
            }
           
        }
        return c1;
    }
}