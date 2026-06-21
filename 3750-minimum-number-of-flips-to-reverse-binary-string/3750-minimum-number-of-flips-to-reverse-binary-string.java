class Solution {
    public int minimumFlips(int n) {
        String bin=Integer.toBinaryString(n);
        String bin1="";
        for(int i=bin.length()-1;i>=0;i--)
        {
            bin1+=bin.charAt(i);
        }
        int c=0;
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)!=bin1.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
}