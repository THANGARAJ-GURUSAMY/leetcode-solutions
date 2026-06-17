class Solution {
    public List<String> cellsInRange(String s) {
        List<String> l=new ArrayList<>();
        String[] a=s.split(":");
        int n1=a[0].charAt(1)-'0';
        int n2=a[1].charAt(1)-'0';
        char c1=a[0].charAt(0);
        char c2=a[1].charAt(0);
        for(char i=c1;i<=c2;i++)
        {
            for(int j=n1;j<=n2;j++)
            {
                String m="";
                m+=i;
                m+=j;
                l.add(m);
            }
        }
        return l;
    }
}