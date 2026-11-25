class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m1=new HashMap<>();
        Map<Integer,Integer> m2=new HashMap<>();
        for(int t:nums1)
        {
            m1.put(t,m1.getOrDefault(t,0)+1);
        }
        for(int t:nums2)
        {
            m2.put(t,m2.getOrDefault(t,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int k:m1.keySet())
        {
            int n1=m1.getOrDefault(k,0);
            int n2=m2.getOrDefault(k,0);
            if(n2!=0)
            {
            int min=Math.min(n1,n2);
            for(int i=0;i<min;i++)
            {
                l.add(k);
            }
            }
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }
        return res;
    }
}