class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=1;i<s.length();i++)
        {
            int n1=s.charAt(i-1)-'0';
            int n2=s.charAt(i)-'0';
            int d=Math.abs(n1-n2);
            if(d>2)
            {
                return false;
            }
        }
        return true;
    }
}