class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int tot=0;
        for(int i=0;i<points.length-1;i++)
        {
            int x1=points[i][0];
            int x2=points[i][1];
            int y1=points[i+1][0];
            int y2=points[i+1][1];
            int m1=Math.abs(x1-y1);
            int m2=Math.abs(x2-y2);
            tot+=Math.max(m1,m2);
        }
        return tot;
    }
}