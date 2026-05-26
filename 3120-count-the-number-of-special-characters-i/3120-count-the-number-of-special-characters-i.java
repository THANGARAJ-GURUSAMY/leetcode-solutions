class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set=new HashSet<>();
        for(char c:word.toCharArray())
        {
            set.add(c);
        }
        List<Character> s=new ArrayList<>();
        int co=0;
        for(char c:set)
        {
           if(Character.isLowerCase(c))
           {
            s.add(c);
           }
           else
           {
              char m=Character.toLowerCase(c);
              if(set.contains(m))
              {
                co++;
              }
           }
          
        }
        return co;


    }
}