class Solution {
    public int secondHighest(String s) {
        List<Integer> l1=new ArrayList<>();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                int n=c-'0';
                l1.add(n);
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int c:l1)
        {
            set.add(c);
        }
        List<Integer> l2=new ArrayList<>(set);
        if(l2.size()<=1)
        {
            return -1;
        }
        Collections.sort(l2,Collections.reverseOrder());
        return l2.get(1);
    }
}