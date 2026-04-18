class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(nums[i]);
        }
        int num1=pq.poll();
        int num2=pq.poll();
        return (num1-1)*(num2-1);
    }
}