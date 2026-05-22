class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int pos=-1;
        while(i<nums.length)
        {
            if(nums[i]==target)
            {
                pos=i;
                break;
            }
            i++;
        }
        return pos;
    }
}