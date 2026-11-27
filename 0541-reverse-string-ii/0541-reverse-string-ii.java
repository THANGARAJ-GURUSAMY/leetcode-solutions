class Solution {
    public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            int l=i;
            int r=Math.min(i+k-1,s.length()-1);
            while(l<r)
            {
                char t=a[l];
                a[l]=a[r];
                a[r]=t;
                l++;
                r--;
            }

        }
        return new String(a);

    }
}