class Solution {
    public int maximumStrongPairXor(int[] nums) {
      int max=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)
      {
        int x=nums[i];
        for(int j=0;j<nums.length;j++)
        {
            int y=nums[j];
            int d=Math.abs(x-y);
            int min=Math.min(x,y);
            if(d<=min)
            {
                int t=x^y;
                max=Math.max(t,max);
            }
        }
      }  
      return max;
    }
}