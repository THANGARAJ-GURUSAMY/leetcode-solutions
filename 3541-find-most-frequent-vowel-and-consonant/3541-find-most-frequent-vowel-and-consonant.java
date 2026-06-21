class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                map1.put(c,map1.getOrDefault(c,0)+1);
            }
            else
            {
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
        }
        int max1=0;
        int max2=0;
        for(char c:map1.keySet())
        {
            if(map1.get(c)>max1)
            {
                max1=map1.get(c);
            }
        }
        for(char c:map2.keySet())
        {
            if(map2.get(c)>max2)
            {
                max2=map2.get(c);
            }
        }
        return max1+max2;
    }
}