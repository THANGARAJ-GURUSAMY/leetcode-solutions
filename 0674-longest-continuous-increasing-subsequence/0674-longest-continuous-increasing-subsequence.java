class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int c=1;
            int num=nums[i];
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]>num)
                {
                    c++;
                    num=nums[j];
                }
                else
                {
                    break;
                }
            }
            max=Math.max(max,c);
        }
        return max;
    }
}