class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(char c:map.keySet())
        {
            int num=map.get(c);
            max=Math.max(max,num);
        }
        for(char c:map.keySet())
        {
            if(map.get(c)!=max)
            {
                return false;
            }
        }
        return true;
    }
}