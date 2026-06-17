class Solution {
    public int convertTime(String current, String correct) {
        int cur=Integer.parseInt(current.substring(0,2))*60+Integer.parseInt(current.substring(3));
        int cor=Integer.parseInt(correct.substring(0,2))*60+Integer.parseInt(correct.substring(3));
        int d=cor-cur;
        int count=0;
        int[] op={60,15,5,1};
        for(int t:op)
        {
            count+=d/t;
            d%=t;
        }
        return count;
    }
}