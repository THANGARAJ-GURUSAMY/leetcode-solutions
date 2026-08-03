class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int t:nums)
        {
            map.put(t,map.getOrDefault(t,0)+1);
        }
        while(k>0)
        {
            int max=0;
            int num=0;
            for(int key:map.keySet())
            {
                if(map.get(key)>max)
                {
                    max=map.get(key);
                    num=key;
                }
            }
            l.add(num);
            map.remove(num);
            k--;
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }
        return res;
    }
}