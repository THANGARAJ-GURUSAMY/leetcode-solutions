class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        int[] res=new int[nums.length];
        int k1=0;
        for(int i=n-k;i<nums.length;i++)
        {
            res[k1]=nums[i];
            k1++;
        }
        for(int i=0;i<n-k;i++)
        {
            res[k1]=nums[i];
            k1++;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=res[i];
        }
    }
}