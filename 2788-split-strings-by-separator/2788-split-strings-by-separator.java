class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> l=new ArrayList<>();
        for(String m:words)
        {
            String[] a=m.split("\\"+separator);
            for(int i=0;i<a.length;i++)
            {
                if(a[i].length()>0)
                {
                l.add(a[i]);
                }
            }
        }
        return l;
    }
}