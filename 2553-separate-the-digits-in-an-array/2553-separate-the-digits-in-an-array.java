class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int t:nums)
        {
            String s=String.valueOf(t);
            for(int i=0;i<s.length();i++)
            {
                l.add(s.charAt(i)-'0');
            }
        }
        int[] ans=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            ans[i]=l.get(i);
        }
        return ans;
    }
}