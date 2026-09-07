class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> l=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String m=s.substring(i,i+10);
            map.put(m,map.getOrDefault(m,0)+1);
            if(map.get(m)==2)
            {
                l.add(m);
            }
        }
        return l;

    }
}