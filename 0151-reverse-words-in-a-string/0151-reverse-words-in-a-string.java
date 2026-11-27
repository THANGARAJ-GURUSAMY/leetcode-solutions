class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] a=s.split("\\s+");
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            String m=a[l];
            a[l]=a[r];
            a[r]=m;
            l++;
            r--;
        }
        StringBuilder b=new StringBuilder();
        for(String m:a)
        {
            b.append(m).append(" ");
        }
        return b.toString().trim();


    }
}