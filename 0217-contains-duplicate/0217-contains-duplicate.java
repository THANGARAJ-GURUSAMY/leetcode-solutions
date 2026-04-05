class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int t:nums)
        {
            if(set.contains(t))
            {
                return true;
            }
            set.add(t);
        }
        return false;
        
    }
}