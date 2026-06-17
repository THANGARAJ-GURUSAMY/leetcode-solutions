class Solution {
    public int countPoints(String rings) {
        Set<Character> set=new HashSet<>();
        for(char c:rings.toCharArray())
        {
            if(Character.isDigit(c))
            {
                set.add(c);
            }
        }
        int count=0;
        List<Character> l=new ArrayList<>(set);
        for(char c:l)
        {
            String res="";
            for(int i=0;i<rings.length();i++)
            {
                if(rings.charAt(i)==c)
                {
                    res+=rings.charAt(i-1);
                }
            }
            if(res.contains("R")&&res.contains("G")&&res.contains("B"))
            {
                count++;
            }
        }
        return count;
    }
}