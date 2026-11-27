class Solution {
    public String reverseWords(String s) {
        char[] a=s.toCharArray();
        int i=0;
        for(int j=0;j<=a.length;j++)
        {
            if(j==a.length||a[j]==' ')
            {
                int l=i;
                int r=j-1;
                while(l<r)
                {
                    char t=a[l];
                    a[l]=a[r];
                    a[r]=t;
                    l++;
                    r--;
                }
                i=j+1;
            }
        }
        return new String(a);
    }
}