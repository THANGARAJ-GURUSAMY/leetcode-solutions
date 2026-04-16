class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(nums[i]);
        }
        int num=nums.length-k-1;
        for(int i=0;i<=num;i++)
        {
            pq.poll();
        }
        return pq.peek();
    }
}