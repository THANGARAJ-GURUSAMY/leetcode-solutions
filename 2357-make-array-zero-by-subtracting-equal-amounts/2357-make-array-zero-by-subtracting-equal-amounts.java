class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        while(true)
        {
            boolean f=true;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                {
                    f=false;
                    break;
                }
            }
            if(f)
            {
                break;
            }
            int min=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                {
                    min=Math.min(min,nums[i]);
                }
            }
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                {
                    nums[i]=nums[i]-min;
                }
            }
            c++;

        }
        return c;
    }
}