class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        char c=words[0].charAt(0);
        for(String s:words)
        {
            for(char c1:s.toCharArray())
            {
                map.put(c1,map.getOrDefault(c1,0)+1);
            }
        }
        int num=words.length;
        for(char c1:map.keySet())
        {
            if(map.get(c1)%num!=0)
            {
                return false;
            }
        }
        return true;
    }
}