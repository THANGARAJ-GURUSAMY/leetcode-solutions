class Solution {
    public int[] numberGame(int[] nums) {
        int[] res=new int[nums.length];
        int k=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(nums[i]);
        }
        for(int i=0;i<nums.length/2;i++)
        {
            int n1=pq.poll();
            int n2=pq.poll();
            res[k++]=n2;
            res[k++]=n1;
        }
        return res;
    }
}