class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String m:details)
        {
            int num=Integer.parseInt(m.substring(11,13));
            if(num>60)
            {
                c++;
            }
        }
        return c;
    }
}