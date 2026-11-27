class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j)
        {
            if(!Character.isLetter(s.charAt(i)))
            {
                i++;
            }
            else if(!Character.isLetter(s.charAt(j)))
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