class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] a=new int[26];
        Arrays.fill(a,-1);
        int max=-1;
        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'a';
            if(a[idx]==-1)
            {
                a[idx]=i;
            }
            else
            {
                max=Math.max(max,i-a[idx]-1);
            }
        }
        return max;
    }
}