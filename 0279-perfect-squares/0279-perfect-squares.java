class Solution {
    public int numSquares(int n) {
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        q.add(n);
        visited[n]=true;
        int l=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            l++;
            while(size-- >0)
            {
               int e=q.poll();
               for(int i=1;i*i<=e;i++)
               {
                 int cur=e-(i*i);
                 if(cur==0)
                 {
                    return l;
                 }
                 if(!visited[cur])
                 {
                    visited[cur]=true;
                    q.add(cur);
                 }

               }  
            }
        }
        return l;
    }
}