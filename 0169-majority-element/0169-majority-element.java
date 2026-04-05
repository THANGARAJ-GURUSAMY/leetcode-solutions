class Solution {
    public int majorityElement(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int t:nums)
        {
            set.add(t);
        }
        int max=0;
        int num=0;
        for(int t:set)
        {
            int c=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==t)
                {
                    c++;
                }
            }
            if(c>max)
            {
                max=c;
                num=t;
            }
        }
        return num;
        
    }
}