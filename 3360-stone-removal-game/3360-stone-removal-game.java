class Solution {
    public boolean canAliceWin(int n) {
        int stone=10;
        while(n>=stone)
        {
            n=n-stone;
            stone--;
            if(stone==0)
            {
                break;
            }
        }
        return stone%2==1;
    }
}