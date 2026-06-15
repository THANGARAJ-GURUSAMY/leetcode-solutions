class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num=coordinates.charAt(0)-'a'+1;
        int num1=coordinates.charAt(1)-'0';
        if(num%2==1)
        {
            if(num1%2==1)
            {
                return false;
            }
        }
        else
        {
            if(num1%2==0)
            {
                return false;
            }
        }
        return true;
    }
}