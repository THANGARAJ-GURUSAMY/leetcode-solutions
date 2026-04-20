class Solution {
    public int maxDistance(int[] colors) {
       int val=colors[0];
       int pos1=0;
       int pos2=-1;
       for(int i=colors.length-1;i>=1;i--)  
       {
         if(colors[i]!=val)
         {
            pos2=i;
            break;
         }
       }
       int max1=Math.abs(pos1-pos2);
     
       pos1=colors.length-1;
       pos2=-1;
       for(int i=0;i<colors.length-1;i++)
       {
        if(colors[i]!=colors[colors.length-1])
        {
            pos2=i;
            break;
        }
       }
       int max2=Math.abs(pos1-pos2);
       return Math.max(max1,max2);
    }
}