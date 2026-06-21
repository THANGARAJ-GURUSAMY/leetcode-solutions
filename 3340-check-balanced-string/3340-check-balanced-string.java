class Solution {
    public boolean isBalanced(String num) {
        int t1=0;
        int t2=0;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            {
                t1+=(num.charAt(i)-'0');
            }
            else
            {
                t2+=(num.charAt(i)-'0');
            }
        }
        return t1==t2;
    }
}