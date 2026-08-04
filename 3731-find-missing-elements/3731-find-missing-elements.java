class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int t:nums)
        {
            set.add(t);
            min=Math.min(min,t);
            max=Math.max(max,t);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(!set.contains(i))
            {
                l.add(i);
            }
        }
        return l;

    }
}