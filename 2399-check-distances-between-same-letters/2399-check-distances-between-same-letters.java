class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Set<Character> set=new LinkedHashSet<>();
        for(char c:s.toCharArray())
        {

            set.add(c);
        }
        int[] d=new int[26];
        int k=0;
        for(char c:set)
        {
            int i1=-1,i2=-1;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==c&&i1==-1)
                {
                    i1=i;
                }
                else if(s.charAt(i)==c)
                {
                    i2=i;
                    break;
                }
            }
            d[c-'a']=(i2-i1-1);
        }
        for(char c:set)
        {
            if(d[c-'a']!=distance[c-'a'])
            {
                return false;
            }
        }
        return true;
    }
}