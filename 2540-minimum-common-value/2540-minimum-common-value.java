class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set=new TreeSet<>();
        for(int t:nums1)
        {
           set.add(t);
        }
        for(int t:nums2)
        {
            if(set.contains(t))
            {
                return t;
            }
        }
        return -1;
    }
}