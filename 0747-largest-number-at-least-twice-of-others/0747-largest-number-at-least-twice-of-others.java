class Solution {
    public int dominantIndex(int[] nums) {
        int pos=-1;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            boolean found=true;;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[j]*2>num)
                    {
                        found=false;
                        break;
                    }
                    
                }
            }
            if(found)
            {
                pos=i;
                break;
            }
        }
        return pos;
        
    }
}