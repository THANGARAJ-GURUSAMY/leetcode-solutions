class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int t:nums)
        {
            set.add(t);

        }
        int k=0;
        for(int t:set)
        {
            nums[k++]=t;
        }
        return k;
    }
}