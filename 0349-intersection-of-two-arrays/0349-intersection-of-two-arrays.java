class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int t:nums1)
        {
            set.add(t);
        }
        Set<Integer> s=new HashSet<>();
        for(int t:nums2)
        {
            if(set.contains(t))
            {
                s.add(t);
            }
        }
        int[] res=new int[s.size()];
        int i=0;
        for(int t:s)
        {
           res[i++]=t;
        }
        return res;
    }
}