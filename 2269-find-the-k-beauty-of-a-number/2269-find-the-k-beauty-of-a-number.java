class Solution {
    public int divisorSubstrings(int num, int k) {
        String m=String.valueOf(num);
        int c=0;
        for(int i=0;i<=m.length()-k;i++)
        {
            String a="";
            for(int j=i;j<i+k;j++)
            {
                a+=m.charAt(j);
            }
            int n=Integer.parseInt(a);
            if(n!=0&&num%n==0)
            {
                c++;
            }
        }
        return c;
    }
}