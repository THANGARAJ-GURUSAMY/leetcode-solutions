class Solution {
    public String generateTag(String caption) {
        caption = caption.trim();
        String[] a=caption.split("\\s+");
        StringBuilder sb=new StringBuilder();
        sb.append('#');
        if(a.length>0&&a[0].length()>0)
        {
        sb.append(Character.toLowerCase(a[0].charAt(0)));
        String m1=a[0].substring(1);
        sb.append(m1.toLowerCase());
        }
        for(int i=1;i<a.length;i++)
        {
            String m=a[i];
            if(m.length()>0)
            {
            sb.append(Character.toUpperCase(m.charAt(0)));
            String m2=m.substring(1);
            sb.append(m2.toLowerCase());
            }
        }
        String s=sb.toString();
        int l=s.length();
        if(l>100)
        {
            int n=l-100;
            l-=n;
        }
        return s.substring(0,l);

    }
}