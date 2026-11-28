class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int t=nums[i];
            if(set.contains(t))
            {
                return true;
            }
            set.add(t);
            if(set.size()>k)
            {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}