class Solution {
    public String frequencySort(String s) {
        Set<Character> s1=new HashSet<>();
        Set<Character> s2=new HashSet<>();
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                s1.add(c);
            }
            else
            {
                s2.add(c);
            }
            m.put(c,m.getOrDefault(c,0)+1);

        }
        StringBuilder sb=new StringBuilder();
        int max=0;
        for(char c:m.keySet())
        {
            int num=m.get(c);
            max=Math.max(max,num);

        }
        while(max>0)
        {
            for(char c:s1)
            {
                int num=m.get(c);
                if(num==max)
                {
                    for(int i=0;i<num;i++)
                    {
                        sb.append(c);
                    }
                }
            }
            for(char c:s2)
            {
                int num=m.get(c);
                if(num==max)
                {
                   for(int i=0;i<num;i++)
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