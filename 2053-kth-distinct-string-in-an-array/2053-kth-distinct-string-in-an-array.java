class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> set=new LinkedHashSet<>();
        for(String s:arr)
        {
            set.add(s);
        }
        Map<String,Integer> map=new HashMap<>();
        for(String s:arr)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int k1=0;
        for(String s:set)
        {
            if(map.get(s)==1)
            {
                k1++;
                if(k1==k)
                {
                    return s;
                }
            }
        }
        return "";
    }
}