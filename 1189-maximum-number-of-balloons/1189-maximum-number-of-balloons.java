class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:text.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int co=0;
        while(true)
        {
            if(map.getOrDefault('b',0)==0||map.getOrDefault('a',0)==0||map.getOrDefault('n',0)==0||map.getOrDefault('l',0)<2||map.getOrDefault('o',0)<2)
            {
                break;
            }
                co++;
                map.put('b',map.get('b')-1);
                map.put('a',map.get('a')-1);
                map.put('n',map.get('n')-1);
                map.put('l',map.get('l')-2);
                map.put('o',map.get('o')-2);
        }
        return co;
    }
}