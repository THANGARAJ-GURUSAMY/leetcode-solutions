class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
            l1.add(nums[i]);
        }
        for(int i=0;i<k;i++)
        {
            Collections.sort(l1);
            int num=l1.get(0);
            int idx=l.indexOf(num);
            int val=num*multiplier;
            l.set(idx,val);
            l1.set(l1.indexOf(num),val);
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }
        return res;
    }
}