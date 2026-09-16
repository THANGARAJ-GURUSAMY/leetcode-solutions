class Solution {
    public int firstUniqChar(String s) {
        Set<Character> set=new LinkedHashSet<>();
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray())
        {
            set.add(c);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(char c:set)
        {
            int n=m.get(c);
            if(n==1)
            {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}