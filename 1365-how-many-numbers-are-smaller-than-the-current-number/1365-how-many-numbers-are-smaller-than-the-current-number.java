class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] n = new int[nums.length];
        int k=0;
        for(int t:nums)
        {
            int c=0;
            for(int i=0;i<nums.length;i++)
            { 
               if(t>nums[i])
               {
                c++;
               }
            }
            n[k]=c;
            k++;
        }
        return n;
    }
}