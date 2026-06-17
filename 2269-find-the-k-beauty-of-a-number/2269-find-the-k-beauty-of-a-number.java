class Solution {
    public int divisorSubstrings(int num, int k) {
        String m=String.valueOf(num);
        int c=0;
        for(int i=0;i<=m.length()-k;i++)
        {
            String m1=m.substring(i,i+k);
            int num1=Integer.parseInt(m1);
            if(num1!=0&&num%num1==0)
            {
                c++;
            }
        }
        return c;
    }
}