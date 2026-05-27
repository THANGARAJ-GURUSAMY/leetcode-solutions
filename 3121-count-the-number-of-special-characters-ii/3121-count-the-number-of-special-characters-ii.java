class Solution {
    public int numberOfSpecialChars(String word) {
        
        Set<Character> set = new HashSet<>();
        
        for(char c : word.toCharArray())
        {
            set.add(c);
        }

        int co = 0;

        for(char c : set)
        {
            if(Character.isUpperCase(c))
            {
                char m = Character.toLowerCase(c);

                if(set.contains(m))
                {
                    int lastLower = word.lastIndexOf(m);
                    int firstUpper = word.indexOf(c);

                    if(lastLower < firstUpper)
                    {
                        co++;
                    }
                }
            }
        }

        return co;
    }
}