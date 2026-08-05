class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int ans=1,count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                count++;
            }
            else
            {
                count=1;
            }
            ans=Math.max(ans,count);
            
        }
        return ans;
    }
}