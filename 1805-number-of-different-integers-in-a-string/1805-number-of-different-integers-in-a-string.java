class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set=new HashSet<>();
        int pos1=-1;
        int pos2=-1;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isDigit(word.charAt(i)))
            {
                
                if(pos1==-1)
                {
                    pos1=i;
                }
                pos2=i;
            }
            else
            {
                if(pos1!=-1&&pos2!=-1)
                {
                    String m=word.substring(pos1,pos2+1);
                    m=m.replaceFirst("^0+","");
                    if(m.equals(""))
                    {
                        m="0";
                    }
                    set.add(m);
                }
                pos1=-1;
                pos2=-1;
            }
        }
        if(pos1!=-1&&pos2!=-1)
        {
            String m=word.substring(pos1,pos2+1);
            m=m.replaceFirst("^0+","");
            if(m.equals(""))
            {
                m="0";
            }
            set.add(m);
        }
        return set.size();
    }
}