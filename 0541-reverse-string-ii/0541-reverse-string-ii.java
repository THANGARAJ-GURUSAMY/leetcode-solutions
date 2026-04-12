class Solution {
    public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();
        int i=0;
        while(i<a.length)
        {
           int l=i;
           int r=Math.min(i+k-1,a.length-1);
           while(l<r)
           {
             char c=a[l];
             a[l]=a[r];
             a[r]=c;
             l++;
             r--;
           }
           i+=2*k;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:a)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}