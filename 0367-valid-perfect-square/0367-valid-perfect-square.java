class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        int size=num/2;
        for(int i=1;i<=size;i++)
        {
            if(i*i==num)
            {
                return true;
            }
        }
        return false;
    }
}