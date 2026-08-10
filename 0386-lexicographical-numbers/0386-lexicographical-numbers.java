class Solution {
    public List<Integer> lexicalOrder(int n) {
        Set<String> set=new TreeSet<>();
        for(int i=1;i<=n;i++)
        {
            String m=String.valueOf(i);
            set.add(m);
        }
        List<Integer> l=new ArrayList<>();
        for(String s:set)
        {
            l.add(Integer.parseInt(s));
        }
        return l;
    }
}