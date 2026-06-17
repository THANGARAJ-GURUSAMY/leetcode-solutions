class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        String[] a=title.split(" ");
        for(String m:a)
        {
            if(m.length()==1||m.length()==2)
            {
                sb.append(m.toLowerCase()).append(" ");
            }
            else
            {
            sb.append(Character.toUpperCase(m.charAt(0)));
            String m1=m.substring(1);
            sb.append(m1.toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}