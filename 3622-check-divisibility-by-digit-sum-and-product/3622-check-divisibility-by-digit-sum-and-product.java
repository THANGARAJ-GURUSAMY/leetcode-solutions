class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int num=n;
        while(num!=0)
        {
            int t=num%10;
            sum+=t;
            p*=t;
            num/=10;
        }
        int tot=sum+p;
        return n%tot==0;
    }
}