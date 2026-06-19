class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] a=sentence.split(" ");
        char c=a[0].charAt(a[0].length()-1);
        for(int i=1;i<a.length;i++)
        {
            String m=a[i];
            char c1=m.charAt(0);
            if(c!=c1)
            {
                return false;
            }
            else
            {
               c=m.charAt(m.length()-1);

            }
        }
        char c11=sentence.charAt(0);
        char c22=sentence.charAt(sentence.length()-1);
        if(c11!=c22)
        {
            return false;
        }
        return true;
    }
}