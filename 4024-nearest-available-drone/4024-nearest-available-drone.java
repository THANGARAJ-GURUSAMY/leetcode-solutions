class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int pos=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++)
        {
            int x1=drones[i][0];
            int y1=drones[i][1];
            int x2=target[0];
            int y2=target[1];
            int n1=Math.abs(x1-x2);
            int n2=Math.abs(y1-y2);
            int ans=n1+n2;
            if(ans<min&&ans<=drones[i][2])
            {
                min=ans;
                pos=i;
            }
        }
        return pos;
    }
}