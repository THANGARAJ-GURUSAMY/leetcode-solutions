class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new TreeMap<>();
        List<String> l=new ArrayList<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(String s:map.keySet())
        {
            int n=map.get(s);
            max=Math.max(max,n);
        }
        while(true)
        {
            for(String s:map.keySet())
            {
                if(map.get(s)==max)
                {
                    l.add(s);
                    k--;
                }
                if(k==0)
                {
                    break;
                }
            }
            if(k==0)
            {
                break;
            }
            max--;
            
        }
        return l;
    }
}