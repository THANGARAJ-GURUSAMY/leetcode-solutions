class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int t1=Integer.parseInt(event1[0].substring(0,2))*60+Integer.parseInt(event1[0].substring(3));
        int t2=Integer.parseInt(event1[1].substring(0,2))*60+Integer.parseInt(event1[1].substring(3));
        int t3=Integer.parseInt(event2[0].substring(0,2))*60+Integer.parseInt(event2[0].substring(3));
        int t4=Integer.parseInt(event2[1].substring(0,2))*60+Integer.parseInt(event2[1].substring(3));
        return Math.max(t1,t3)<=Math.min(t2,t4);
    }
}