class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> l=new ArrayList<>();
        int i=0;
        while(i<s.length()-1)
        {
            List<Integer> l1=new ArrayList<>();
            l1.add(i);
            int c=0;
            char ch=s.charAt(i);
            if(s.charAt(i)==s.charAt(i+1))
            {
                int j=i;
                while(j<s.length())
                {
                   if(ch!=s.charAt(j))
                   {
                    break;
                   }
                   else
                   {
                    c++;
                   }
                   j++;
                }
                if(c>=3)
                {
                    l1.add(j-1);
                } 
                if(l1.size()>1)
                {
                    l.add(l1);
                }
                i+=c;
            }
            else
            {
                i++;
            }


        }
        return l;
    }
}