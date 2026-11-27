class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        char[] a=word.toCharArray();
        int l=0;
        int r=idx;
        while(l<r)
        {
            char t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
        return new String(a);
    }
}