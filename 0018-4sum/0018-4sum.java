class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int l=j+1;
                int r=n-1;
                while(l<r)
                {
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum>target)
                    {
                        r--;
                    }
                    else if(sum<target)
                    {
                        l++;
                    }
                    else
                    {
                        List<Integer> t=Arrays.asList(nums[i],nums[j],nums[l],nums[r]);
                        set.add(t);
                        l++;
                        r--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}