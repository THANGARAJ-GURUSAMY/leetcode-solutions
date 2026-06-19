class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int s1=day(arriveAlice);
        int s2=day(leaveAlice);
        int s3=day(arriveBob);
        int s4=day(leaveBob);
        int s=Math.max(s1,s3);
        int e=Math.min(s2,s4);
        return Math.max(0,e-s+1);
    }
    public static int day(String s)
    {
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(s.substring(0,2));
        int date=Integer.parseInt(s.substring(3));
        int tot=date;
        for(int i=0;i<month-1;i++)
        {
            tot+=d[i];
        
        }
        return tot;
    }
}