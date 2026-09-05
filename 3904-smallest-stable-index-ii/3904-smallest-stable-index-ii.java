class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] v=nums;
        int n=nums.length;
        int[] presum=new int[nums.length];
        int[] suffsum=new int[nums.length];
        presum[0]=v[0];
        for(int i=1;i<nums.length;i++)
        {
            presum[i]=Math.max(presum[i-1],v[i]);
        }
        suffsum[n-1]=v[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suffsum[i]=Math.min(suffsum[i+1],v[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(presum[i]-suffsum[i]<=k)
            {
                return i;
            }
        }
        return -1;
    }
}