import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, int[]> seat = new HashMap<>();

        for(int i=0;i<reservedSeats.length;i++)
        {
            int r=reservedSeats[i][0];
            int c=reservedSeats[i][1];

            if(!seat.containsKey(r))
            {
                seat.put(r,new int[10]);
            }

            seat.get(r)[c-1]=1;
        }

        int co=(n-seat.size())*2;

        for(int r:seat.keySet())
        {
            int[] row=seat.get(r);

            boolean a=true;
            boolean b=true;
            boolean c=true;

            for(int j=1;j<=4;j++)
            {
                if(row[j]==1)
                    a=false;
            }

            for(int j=3;j<=6;j++)
            {
                if(row[j]==1)
                    b=false;
            }

            for(int j=5;j<=8;j++)
            {
                if(row[j]==1)
                    c=false;
            }

            if(a && c)
                co+=2;
            else if(a || b || c)
                co++;
        }

        return co;
    }
}