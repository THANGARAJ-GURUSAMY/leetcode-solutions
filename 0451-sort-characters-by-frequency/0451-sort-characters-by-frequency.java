class Solution {
    public String frequencySort(String s) {
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                set1.add(c);
            }
            else
            {
                set2.add(c);
            }
           map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=-1;
        for(char c:map.keySet())
        {
            int n=map.get(c);
            max=Math.max(max,n);
        }
        StringBuilder sb=new StringBuilder();
        while(max>0)
        {
           for(char c:set1)
           {
              int n=map.get(c);
              if(max==n)
              {
                for(int i=0;i<n;i++)
                {
                    sb.append(c);
                }
              }
           }
           for(char c:set2)
           {
            int n=map.get(c);
            if(max==n)
            {
                for(int i=0;i<n;i++)
                {
                    sb.append(c);
                }
            }
           }
           max--;
        }
        return sb.toString();
        
    }
}