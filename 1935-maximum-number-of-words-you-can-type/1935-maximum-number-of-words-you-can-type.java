class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c=0;
        String[] a=text.split(" ");
        char[] a1=brokenLetters.toCharArray();
        for(String m:a)
        {
            boolean f=true;
            for(char c1:a1)
            {
                String m1=String.valueOf(c1);
                if(m.contains(m1))
                {
                    f=false;
                    break;
                }
            }
            if(f)
            {
                c++;
            }
        }
        return c;
    }
}