class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       
        Set<Character> set=new HashSet<>();
        for(char c:allowed.toCharArray())
        {
            set.add(c);
        }
        int tot=0;
        int n=set.size();
        for(String m:words)
        {
            int c1=0;
            for(char c:m.toCharArray())
            {
                if(!set.contains(c))
                {
                    break;
                }
                else
                {
                   c1++;
                }
            }
            if(c1==m.length())
            {
               tot+=1;
            }
        }
        return tot;
    }
}