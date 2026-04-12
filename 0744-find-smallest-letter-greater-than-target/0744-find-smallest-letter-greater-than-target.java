class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min=Integer.MAX_VALUE;
        int num=target-'a';
        char res=letters[0];
        for(int i=0;i<letters.length;i++)
        {
            int n=letters[i]-'a';
            
            if(n<min&&n>num)
            {
                min=n;
                res=letters[i];
            }
        }
        return res;
    }
}