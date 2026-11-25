class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int t:nums)
        {
            q.add(t*t);
        }
        int[] ans=new int[nums.length];
        int i=0;
        while(!q.isEmpty())
        {
            ans[i++]=q.poll();
        }
        return ans;
    }
}