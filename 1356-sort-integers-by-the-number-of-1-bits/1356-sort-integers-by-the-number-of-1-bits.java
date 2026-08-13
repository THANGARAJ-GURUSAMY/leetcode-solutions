class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int t:arr)
        {
            int n=Integer.bitCount(t);
            if(!map.containsKey(n))
            {
            map.put(n,new ArrayList<>());
            }
            map.get(n).add(t);
        }
        int[] a=new int[arr.length];
        int k=0;
        for(int t:map.keySet())
        {
            List<Integer> l=map.get(t);
            Collections.sort(l);
            for(int t1:l)
            {
               a[k++]=t1;
            }
        }
        return a;
    }
}