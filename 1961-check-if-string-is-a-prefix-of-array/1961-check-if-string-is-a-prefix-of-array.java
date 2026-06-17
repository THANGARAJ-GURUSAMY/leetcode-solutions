class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(String m:words)
        {
            sb.append(m);
            if(sb.length()>=s.length())
            {
                break;
            }
        }
        return s.equals(sb.toString());
    }
}