class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> l=new ArrayList<>();
        int i=0;
        while(i<s.length())
        {
            String res="";
            int num=i+k;
            while(i<num&&i<s.length())
            {
                res+=s.charAt(i);
                i++;
            }
            l.add(res);

        }
        String s1=l.get(l.size()-1);
        if(s1.length()<k)
        {
            while(s1.length()<k)
            {
                s1+=fill;
            }

            l.set(l.size()-1,s1);
        }
        String[] a=new String[l.size()];
        int k1=0;
        for(String m:l)
        {
            a[k1++]=m;
        }
         return a;
    }
}