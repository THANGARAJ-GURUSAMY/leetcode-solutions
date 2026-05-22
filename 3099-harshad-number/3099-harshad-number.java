class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int m=0;
        int size=x;
        while(size>0)
        {
            m+=size%10;
            size/=10;
        }
        if(x%m==0)
        {
            return m;
        }
        return -1;
    }
}