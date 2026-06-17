class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        Set<String> set=new HashSet<>();
        for(String m:words1)
        {
            map1.put(m,map1.getOrDefault(m,0)+1);
            set.add(m);
        }
        for(String m:words2)
        {
            map2.put(m,map2.getOrDefault(m,0)+1);
            set.add(m);
        }
        int c=0;
        for(String m:set)
        {
            int n1=map1.getOrDefault(m,0);
            int n2=map2.getOrDefault(m,0);
            if(n1==1&&n2==1)
            {
                c++;
            }
        }
        return c;
    }
}