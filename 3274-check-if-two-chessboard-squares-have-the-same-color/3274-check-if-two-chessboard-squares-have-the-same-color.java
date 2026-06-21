class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char c1=coordinate1.charAt(0);
        int n11=c1-'a'+1;
        int n1=coordinate1.charAt(1);
        char c2=coordinate2.charAt(0);
        int n22=c2-'a'+1;
        int n2=coordinate2.charAt(1);
        if(n11%2==1&&n22%2==1&&n1%2==1&&n2%2==1)
        {
            return true;
        }
        else if(n11%2==1&&n22%2==1&&n1%2==0&&n2%2==0)
        {
            return true;
        }
        else if(n11%2==0&&n22%2==0&&n1%2==1&&n2%2==1)
        {
            return true;
        }
        else if(n11%2==0&&n22%2==0&&n1%2==0&&n2%2==0)
        {
            return true;
        }
        else if(n11%2==1&&n22%2==0&&((n1%2==1&&n2%2==0)||(n1%2==0&&n2%2==1)))
        {
            return true;
        }
        else if(n11%2==0&&n22%2==1&&((n1%2==1&&n2%2==0)||(n1%2==0&&n2%2==1)))
        {
            return true;
        }
        return false;


        
    }
}