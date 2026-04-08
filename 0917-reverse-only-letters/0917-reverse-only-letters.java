class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a=s.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            if(Character.isLetter(a[i])&&Character.isLetter(a[j]))
            {
                char c=a[i];
                a[i]=a[j];
                a[j]=c;
                i++;
                j--;
            }
            if(!Character.isLetter(a[i]))
            {
                i++;
            }
            if(!Character.isLetter(a[j]))
            {
                j--;
            }

        }
       
        return new String(a);
    }
}