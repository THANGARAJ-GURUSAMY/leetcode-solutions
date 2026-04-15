class Solution {
    public int[] sumZero(int n) {
        int num=n/2;
        int[] a=new int[n];
        int k=0;
        for(int i=1;i<=num;i++)
        {
            a[k++]=i;
            a[k++]=-i;
        }
        Arrays.sort(a);
        return a;

    }
}