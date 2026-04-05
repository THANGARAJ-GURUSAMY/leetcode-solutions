class Solution {
    public int singleNumber(int[] nums) {
      Set<Integer> set=new HashSet<>();
      for(int t:nums)
      {
         if(set.contains(t))
         {
            set.remove(t);
         }
         else
         {
            set.add(t);
         }
      }
      List<Integer> l=new ArrayList<>(set);
      return l.get(0);

        
    }
}