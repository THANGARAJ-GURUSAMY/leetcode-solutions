class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph= paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        Set<String> set=new HashSet<>();
        for(String s:banned)
        {
            set.add(s);
        }       
        String[] a= paragraph.split(" "); 
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(!set.contains(a[i])&&a[i].length()>0)
            {
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
        }
        String ans="";
        int c=0;
        for(String key:map.keySet())
        {
            if(map.get(key)>c)
            {
                c=map.get(key);
                ans=key;
            }
        }
        return ans;
    }
}