class Solution {
    public static boolean check(int n)
    {
        int num=n;
        while(num>0)
        {
            int t=num%10;
            if(t==0||n%t!=0)
            {
                return false;
            }
            num/=10;
        }
        return true;
    } 
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(check(i))
            {
                l.add(i);
            }
        }
        return l;
    }
}