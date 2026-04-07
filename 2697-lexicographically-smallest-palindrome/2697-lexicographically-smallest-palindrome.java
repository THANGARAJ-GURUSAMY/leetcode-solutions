class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] a=s.toCharArray();
        String res="";
        int i=0;
        int j=a.length-1;
        while(i<=j)
        {
            char c1=a[i];
            char c2=a[j];
            if(c1!=c2)
            {
                int n1=c1-'0';
                int n2=c2-'0';
                if(n2>n1)
                {
                    a[j]=a[i];
                }
                else
                {
                    a[i]=a[j];
                }
            }
            i++;
            j--;
        }
        for(int k=0;k<a.length;k++)
        {
            res+=a[k];
        }
        return res;
    }
}