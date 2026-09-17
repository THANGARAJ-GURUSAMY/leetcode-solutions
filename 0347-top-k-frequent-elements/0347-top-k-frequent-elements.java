class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> m=new HashMap<>();
       for(int t:nums)
       {
        m.put(t,m.getOrDefault(t,0)+1);
       }
       int max=0;
       for(int key:m.keySet())
       {
          int n=m.get(key);
          max=Math.max(max,n);
       }
       int[] a=new int[k];
       int k1=0;
       while(k>0)
       {
          for(int key:m.keySet())
          {
            int n=m.get(key);
            if(max==n)
            {
                a[k1]=key;
                k1++;
                k--;
            }
          }
          max--;
       }
       return a;
    }
}