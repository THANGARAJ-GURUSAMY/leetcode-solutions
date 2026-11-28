class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++)
        {
            last[s.charAt(i)-'a']=i;
        }
        List<Integer> ans=new ArrayList<>();
        int st=0;
        int e=0;
        for(int i=0;i<s.length();i++)
        {
            e=Math.max(e,last[s.charAt(i)-'a']);
            if(i==e)
            {
                ans.add(e-st+1);
                st=i+1;
            }
        }
        return ans;
    }
}