class Solution {
    public static boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        boolean f1=false;
        boolean f2=false;
        char[] a=s.toCharArray();
        while(i<j)
        {
           if(!isVowel(s.charAt(i)))
           {
            i++;
           }
           else if(!isVowel(s.charAt(j)))
           {
            j--;
           }
           else
           {
            char t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
           }
        }
        return new String(a);
    }
}