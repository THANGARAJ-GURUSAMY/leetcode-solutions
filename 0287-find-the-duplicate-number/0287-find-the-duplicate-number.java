class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> set=new HashSet<>();
       for(int t:nums)
       {
           if(set.contains(t))
           {
             return t;
           }
           set.add(t);
       }
       return -1;
    }
}