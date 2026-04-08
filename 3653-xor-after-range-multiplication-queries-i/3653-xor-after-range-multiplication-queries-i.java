class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod=1000000007;
        for(int i=0;i<queries.length;i++)
        {
            int idx=queries[i][0];
            int r1=queries[i][1];
            int k1=queries[i][2];
            int v1=queries[i][3];
            if(v1==1)
            {
                continue;
            }
            for(int j=idx;j<=r1;j+=k1)
            {
                nums[j]=(int)((1L*nums[j]*v1)%mod);
            }
        }
        int tot=0;
        for(int t:nums)
        {
            tot^=t;
        }
        return tot;
    }
}