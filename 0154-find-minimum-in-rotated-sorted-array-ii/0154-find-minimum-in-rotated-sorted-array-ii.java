class Solution {
    public int findMin(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int t:nums)
        {
            set.add(t);
        }
        List<Integer> l=new ArrayList<>(set);
        return l.get(0);
    }
}