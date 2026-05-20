class Solution {
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            String s=Integer.toBinaryString(i);
            int co=0;
            for(char c:s.toCharArray())
            {
               if(c=='1')
               {
                co++;
               }
            }
            if(isPrime(co))
            {
                count++;
            }
        }
        return count;
    }
}