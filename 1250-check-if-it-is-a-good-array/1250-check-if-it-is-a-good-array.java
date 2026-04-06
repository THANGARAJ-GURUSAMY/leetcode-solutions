class Solution {
    static int GCD(int a,int b)
    {
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;

        }
        return a;
    }
    public boolean isGoodArray(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res=GCD(res,nums[i]);
        }
        return res==1;
        
    }
}