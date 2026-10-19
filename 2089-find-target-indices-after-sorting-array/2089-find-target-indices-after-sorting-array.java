class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int c=0;
        for(int t:nums)
        {
            if(t<target)
            {
                c++;
            }
        }
        int idx=c;
        List<Integer> l=new ArrayList<>();
        for(int t:nums)
        {
            if(t==target)
            {
                l.add(idx);
                idx++;
            }
        }
        return l;
    }
}