class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int t:nums)
        {
            q.add(t);
        }
        for(int i=0;i<nums.length-k;i++)
        {
            q.poll();
        }
        return q.poll();
    }
}