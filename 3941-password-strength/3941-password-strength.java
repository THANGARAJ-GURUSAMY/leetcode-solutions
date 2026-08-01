class Solution {
    public int passwordStrength(String password) {
        Set<Character> set=new HashSet<>();
        for(char c:password.toCharArray())
        {
            set.add(c);
        }
        int tot=0;
        for(char c:set)
        {
            if(Character.isUpperCase(c))
            {
                tot+=2;
            }
            else if(Character.isLowerCase(c))
            {
                tot+=1;
            }
            else if(Character.isDigit(c))
            {
                tot+=3;
            }
            else
            {
                tot+=5;
            }
        }
        return tot;

    }
}