class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,co=0;
        for(String m:events)
        {
            if(m.equals("W"))
            {
                co++;
                if(co==10)
                {
                    break;
                }
            }
            else if(m.equals("WD"))
            {
                score+=1;
            }
            else if(m.equals("NB"))
            {
                score+=1;
            }
            else
            {
                score+=Integer.parseInt(m);
            }
        }
        return new int[]{score,co};
    }
}