class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] a=new int[n];
        int p=-n;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                p=i;
            }
            a[i]=i-p;
        }
        p=2*n;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
            {
                p=i;
            }
            a[i]=Math.min(a[i],p-i);
        }
        return a;
    }
}