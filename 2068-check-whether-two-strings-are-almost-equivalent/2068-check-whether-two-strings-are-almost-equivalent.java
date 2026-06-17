class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character,Integer> map1=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(char c:word1.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
            set.add(c);
        }
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:word2.toCharArray())
        {
            map2.put(c,map2.getOrDefault(c,0)+1);
            set.add(c);
        }
        int m=0;
        for(char c:set)
        {
            int n1=map1.getOrDefault(c,0);
            int n2=map2.getOrDefault(c,0);
            if(Math.abs(n1-n2)>3)
            {
                return false;
            }
        }
        return true;
        
    }
}