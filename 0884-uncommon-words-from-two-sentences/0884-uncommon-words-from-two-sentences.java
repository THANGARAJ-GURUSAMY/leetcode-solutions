class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a1=s1.split(" ");
        String[] a2=s2.split(" ");
        Set<String> set1=new HashSet<>();
        Set<String> dup1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        Set<String> dup2=new HashSet<>();
        for(String s:a1)
        {
            if(set1.contains(s))
            {
                dup1.add(s);
            }
            else
            {
            set1.add(s);
            }
        }
        for(String s:dup1)
        {
            set1.remove(s);
        }
        for(String s:a2)
        {
            if(set2.contains(s))
            {
                dup2.add(s);

            }
            else
            {
            set2.add(s);
            }
        }
        for(String s:dup2)
        {
            set2.remove(s);
        }
        List<String> l=new ArrayList<>();
        for(String s:set1)
        {
            if(!Arrays.asList(a2).contains(s))
            {
                l.add(s);
            }
        }
        for(String s:set2)
        {
            if(!Arrays.asList(a1).contains(s))
            {
                l.add(s);
            }
        }
        return  l.toArray(new String[0]);
    }
}