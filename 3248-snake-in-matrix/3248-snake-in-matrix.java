class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int tot=0;
        for(String m:commands)
        {
            if(m.equals("RIGHT"))
            {
                tot+=1;
            }
            else if(m.equals("LEFT"))
            {
                tot-=1;
            }
            else if(m.equals("DOWN"))
            {
                tot+=n;
            }
            else if(m.equals("UP"))
            {
                tot-=n;
            }
        }
        return tot;
    }
}