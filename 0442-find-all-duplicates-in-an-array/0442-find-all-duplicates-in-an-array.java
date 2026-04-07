class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int t:nums)
        {
            if(set.contains(t))
            {
                l.add(t);
                
            }
            else
            {
            set.add(t);
            }
        }
        return l;

    }
}