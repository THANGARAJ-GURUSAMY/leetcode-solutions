class Solution {
    public boolean checkPerfectNumber(int num) {
        int size=num/2;
        long tot=0;
        for(int i=1;i<=size;i++)
        {
            if(num%i==0)
            {
                tot+=i;
            }
        }
        return tot==num;
    }
}